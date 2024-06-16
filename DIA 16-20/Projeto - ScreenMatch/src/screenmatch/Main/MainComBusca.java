package screenmatch.Main;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import screenmatch.modelos.ErroDeConversaoDeAnoExeption;
import screenmatch.modelos.Titulo;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainComBusca {

    // Trabalhando com API
    public static void main(String[] args) throws IOException, InterruptedException {
        // Ler o que o usuário quer pesquisar
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();


        // Utilizando a biblioteca Gson que foi importada
        // Fazendo um construtor falando que o json virá com letras maiúsculas. Assim, quando for traduzir as variáveis criadas no Record "TituloOmdb" que estão em minúsculo, assim fará com que não tenha erro na hora de mostrar de pegar o nome, ano e duração do título
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                // Imprimir mais "bonito"
                .setPrettyPrinting()
                .create();

        while (!busca.equalsIgnoreCase("sair")) {

            System.out.println("Digite um filme para a busca: ");
            busca = leitura.nextLine();

            if(busca.equalsIgnoreCase("sair")){
                break;
            }
            // Esse String será responsável por concatenar o endereço da API com o filme que a pessoa digitou, para que assim, a API devolva o arquivo JSON que mostrará as informações sobre o Filme

            try { // Try catch - Lidando com exeções
                String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=6957362c"; // Substituindo um espaço vazio por um + para juntar as palavras

                // Escopo da requisição HTTP da API
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        // A variável "endereco está substituindo o endereço URL da API que está inserido na variável endereco"
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                // Imprimindo a resposta
                String json = response.body();
                System.out.println(json);

                // Convertendo o json para um objeto da classe TituloOmdb que serve para transferir dados
                // Agora irei utilizar a "tradução" a partir do Record "TituloOmdb"
                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                // Agora criando um objeto da classe Titulo
                System.out.println(meuTitulo);

                // Convertendo busca no txt

                titulos.add(meuTitulo);

            } catch (NumberFormatException e) { // Capturando uma formatação errada
                System.out.println("[ERRO]");
                System.out.println(e.getMessage());
            } catch (
                    IllegalArgumentException e) { // Capturando erro na digitação (se tiver espaço na pesquisa do titulo)
                System.out.println("[ERRO] Argumento de busca, verifique o endereço da pesquisa");
            } catch (ErroDeConversaoDeAnoExeption e) {
                System.out.println(e.getMessage());
            }

        }
        System.out.println(titulos);
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        // Tem que indicar o .close para as informações serem salvas
        escrita.close();
        System.out.println("O programa finalizou corretamente!!");
    }
}
