import javax.imageio.IIOException;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {

    // Trabalhando com API
    public static void main(String[] args) throws IOException, InterruptedException {
        // Ler o que o usuário quer pesquisar
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para a busca: ");
        var busca = leitura.nextLine();

        // Esse String será responsável por concatenar o endereço da API com o filme que a pessoa digitou, para que assim, a API devolva o arquivo JSON que mostrará as informações sobre o Filme
        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=6957362c";

        // Escopo da requisição HTTP da API
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                // A variável "endereco está substituindo o endereço URL da API que está inserido na variável endereco"
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        // Imprimindo a resposta
        System.out.println(response.body());
    }
}
