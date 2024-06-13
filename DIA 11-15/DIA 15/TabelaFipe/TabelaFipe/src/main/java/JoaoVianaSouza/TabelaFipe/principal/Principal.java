package JoaoVianaSouza.TabelaFipe.principal;

import JoaoVianaSouza.TabelaFipe.model.Dados;
import JoaoVianaSouza.TabelaFipe.model.Modelos;
import JoaoVianaSouza.TabelaFipe.model.Veiculo;
import JoaoVianaSouza.TabelaFipe.service.ConsumoAPI;
import JoaoVianaSouza.TabelaFipe.service.ConverteDados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {

    // Definindo variável para ler o que o usuário digitar
    Scanner leitura = new Scanner(System.in);

    // Definindo a constante -> Inicio da url da API
    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";

    // Invocando um objeto da classe ConsumoAPI responsável por traduzir a api e trazer para um arquivo .json
    private ConsumoAPI consumo = new ConsumoAPI();

    // Invocando um objeto da classe ConverteDados responsável por passar o .json para tipo classe
    private ConverteDados conversor = new ConverteDados();

    // Método que será mostrado no main
    public void exibeMenu() {

        // Variável responsável por conter a interação com o usuário
        var menu = ("OPÇÕES \n Carro \n Moto \n Caminhão \n Digite uma das opções para consultar: ");

        // Interagir com o usuário
        System.out.println(menu);

        // Ler o que o usuário vai digitar
        var opcao = leitura.nextLine();

        // Declarando uma variável chamada endereço que será usada durante o código
        String endereco;

        // Se o que o usuário digitou, passado para letra minuscula, conter a palavra "carro", execute
        if(opcao.toLowerCase().contains("carro")){
            System.out.println("Você pesquisou por CARRO");
            // Completo a URL base de acordo com a escolha do usuário
            endereco = URL_BASE + "carros/marcas";
        } else if (opcao.toLowerCase().contains("moto")) {
            System.out.println("Você pesquisou por MOTO");
            // Completo a URL base de acordo com a escolha do usuário
            endereco = URL_BASE + "motos/marcas";
        } else {
            System.out.println("Você pesquisou CAMINHÃO");
            // Completo a URL base de acordo com a escolha do usuário
            endereco =  URL_BASE + "caminhoes/marcas";
        }

        // Variável que vai conter o json encontrado no endereço buscado
        var json = consumo.obterDados(endereco);

        // Imprimindo o json que contem todos os códigos e modelos do veículo
        System.out.println(json);

        // Criando uma lista com os dados do json. Essa lista estará mais organizada pois será montada com a aparência de um objeto da classe Dados
        var marcas = conversor.obterLista(json, Dados.class);

        // Passando algumas configurações nessa lista
        marcas.stream()
                // Organizando de acordo com o código
                .sorted(Comparator.comparing(Dados::codigo))
                // Imprimir um por um
                .forEach(System.out::println);

        // Perguntando ao usuário qual marca ele deseja
        System.out.println("Insira o código da marca que você deseja: ");
        // Lendo o código digitado
        var codigoMarca = leitura.nextLine();

        // Agora o endereço será outro, de acordo com o código
        endereco = endereco + "/" + codigoMarca + "/modelos";

        // Vou cirar o json do endereço
        json = consumo.obterDados(endereco);

        // Criar a lista que terá a aparência de um objeto do tipo "Modelos"
        var modeloLista = conversor.obterDados(json, Modelos.class);

        System.out.println("Modelos dessa marca: ");
        // Passando algumas configurações antes de imprimir
        modeloLista.modelos().stream()
                // Organizando pelo código
                .sorted(Comparator.comparing(Dados::codigo))
                // Imprimindo um a um
                .forEach(System.out::println);

        // Perguntando o trecho do veículo a ser buscado
        System.out.println("\nDigite um trecho do nome do veiculo a ser buscado: ");
        // Lendo a informação
        var nomeVeiculo = leitura.nextLine();

        // Criando uma lista de dados
        List<Dados> modelosFiltrados = modeloLista.modelos().stream()
                // Filtrando para mostar apenas os dados  do modelo pesquisado pelo usuário
                // Definindo tanto o nome dentro do arquivo quanto o nome digitado pelo usuário em caixa baixa para não acontecer nenhum erro na hora que for fazer a compração
                // ".contains" -> Vendo se, dentro do nome do modelo tem o que foi digitado peo usuário
                .filter(m -> m.nome().toLowerCase().contains(nomeVeiculo.toLowerCase()))
                // Pegar todos esses modelos achados e coletar / enviar para a lista "modelosFiltrados"
                .collect(Collectors.toList());

        System.out.println("\nModelos filtrados: ");
        // Mostando um a um dos modelos que foram filtrados
        modelosFiltrados.forEach(System.out::println);

        // Pedindo para que o usuário digite o código do veículo de interesse
        System.out.println("Digite o código do seu veiculo de interesse: ");
        var codigoModelo = leitura.nextLine();

        // Consuntando mais um endereço da API
        endereco = endereco + "/" + codigoModelo + "/anos";
        // Transformando o conteúdo encontrado em arquivo.json
        json = consumo.obterDados(endereco);
        System.out.println(json);

        // Criando uma lista de dados -> O json vai retornar o ano do carro e o nome
        List<Dados> anos = conversor.obterLista(json, Dados.class);

        // Criando uma lista de veículos
        List<Veiculo> veiculos = new ArrayList<>();

        // Pesquisando cada ano encontrado daquele modelo de carro pesquisado pelo usuário
        for (int i = 0; i < anos.size(); i++) {
            // Novo endereço de acordo com digitado
            var enderecoAnos = endereco + "/" + anos.get(i).codigo();
            // Consumindo a api e gerando o .json
            json = consumo.obterDados(enderecoAnos);
            // Criando um objeto do tipo veículo e incluindo ele na lista de veículos
            Veiculo veiculo = conversor.obterDados(json, Veiculo.class);
            veiculos.add(veiculo);

        }
        // Imprimindo os veículos filtrados
        System.out.println("Todos os veículos filtrados por ano: ");
        veiculos.forEach(System.out::println);
    }
}


