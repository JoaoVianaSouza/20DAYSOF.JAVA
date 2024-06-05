


import com.google.gson.Gson; // Importa a classe Gson da biblioteca Gson
import com.google.gson.GsonBuilder; // Importa a classe GsonBuilder da biblioteca Gson

// Define um record chamado Pessoa com três campos: nome, idade e cidade
record Pessoa(String nome, int idade, String cidade) {}

public class Main {
    public static void main(String[] args) {
        // Define uma string JSON com os dados da pessoa
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"cidade\":\"Brasília\"}";

        // Cria uma instância de Gson usando GsonBuilder configurado como lenient (tolerante)
        Gson gson = new GsonBuilder().setLenient().create();

        // Converte a string JSON para um objeto Pessoa
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        // Imprime o objeto Pessoa
        System.out.println("Objeto Pessoa: " + pessoa);
    }
}
