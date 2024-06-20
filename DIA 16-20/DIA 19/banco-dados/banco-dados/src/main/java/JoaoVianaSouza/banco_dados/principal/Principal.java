package JoaoVianaSouza.banco_dados.principal;

import JoaoVianaSouza.banco_dados.models.Estado;
import JoaoVianaSouza.banco_dados.models.UsuarioCadastro;
import JoaoVianaSouza.banco_dados.repository.CadastroRepository;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.springframework.dao.DataIntegrityViolationException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Principal extends UsuarioCadastro {
    // Cria uma instância da entidade UsuarioCadastro
    UsuarioCadastro usuario = new UsuarioCadastro();

    // Scanner para ler dados de entrada do usuário
    Scanner leitura = new Scanner(System.in);

    // Repositório para acessar os métodos do banco de dados
    private CadastroRepository repositorio;

    // Construtor que inicializa o repositório
    public Principal(CadastroRepository repositorio) {
        this.repositorio = repositorio;
    }

    // Método que exibe o menu e salva os dados no banco de dados
    public void menu(){
        System.out.println("Bem vindo ao sistema de cadastro. Selecione abaixo a ação que deseja realizar: \n" +
                "1 - Cadastro de usuário\n" +
                "2 - Busca por usuário\n" +
                "3 - Listar usuários de um Estado\n" +
                "4 - Listar por ano de nascimento\n");
        var escolha = leitura.nextInt();

        switch (escolha) {
            case 1:
                cadastroDeUsuario();
                break;
            case 2:
                buscaPorCpf();
                break;
            case 3:
                buscaPorEstado();
                break;
            case 4:
                buscarPorDataDeNascimento();
                break;

        }

    }

    private void buscarPorDataDeNascimento() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o ano que deseja filtrar: ");
        var ano = leitura.nextInt(); leitura.nextLine();

        List<UsuarioCadastro> usuariosAno = repositorio.findByAnoDeNascimento(ano);
        usuariosAno.forEach(System.out::println);

    }

    private void buscaPorEstado() {
        System.out.println("Digite a sigla do estado que deseja filtrar: ");
        String siglaBusca = leitura.nextLine().toUpperCase();

        try {
            Estado estadoEnum = Estado.valueOf(siglaBusca); // Converte a string para enum
            List<UsuarioCadastro> usuariosCadastrados = repositorio.findByEstado(estadoEnum);
            // Se a lista ão estiver vazia
            if (!usuariosCadastrados.isEmpty()) {
                usuariosCadastrados.forEach(System.out::println);
            } else {
                System.out.println("Não possuímos nenhum usuário cadastrado no Estado " + siglaBusca);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("[ERRO!] Digite a abreviação correta");
        }
    }


    private void buscaPorCpf() {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o CPF do usuário buscado: ");
        var cpfBusca = leitura.nextLine();

        Optional<UsuarioCadastro> usuariosCadastrados =repositorio.findByCpfContainingIgnoreCase(cpfBusca);

        if(usuariosCadastrados.isPresent()){
            System.out.println(usuariosCadastrados.get());
        }else {
            System.out.println("Usuário não cadastrado!");
        }


    }

    private void cadastroDeUsuario() {
        Scanner leitura = new Scanner(System.in);
        // Solicita o nome do usuário
        System.out.println("Digite o nome do usuário: ");
        var nome = leitura.nextLine();
        usuario.setNome(nome);

        // Solicita data de nascimento do usuário
        System.out.println("Digite a data de nascimento: ");
        var data = leitura.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        usuario.setDataNascimento (LocalDate.parse(data, formatter));

        // Solicita o CPF do usuáriO
        try{
            for (int i = 1; i != 0; i++){
                System.out.println("Digite o CPF (Apenas Números): ");
                String cpf = leitura.nextLine();
                // Verificando se o CPF tem o numero correto de caracteres
                if(cpf.length() == 11){
                    usuario.setCpf(cpf);
                    break;
                } else {
                    System.out.println("Digite um CPF válido");
                }
            }

        } catch (DataIntegrityViolationException e){
            System.out.println("[ERRO] CPF já cadastrado.");
        }


        // Solicita a cidade natal do usuário
        System.out.println("Digite a cidade natal: ");
        var cidade = leitura.nextLine();
        usuario.setCidadeNatal(cidade);

        boolean estadoValido = false;
        while (!estadoValido) {
            System.out.println("Digite a sigla do Estado: ");
            var estado = leitura.nextLine().toUpperCase();
            try {
                Estado estadoEnum = Estado.valueOf(estado);
                usuario.setEstado(estadoEnum);
                estadoValido = true; // Estado é válido, sai do loop
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO!] Digite a abreviação correta.");
            }
        } repositorio.save(usuario);

        }


}


