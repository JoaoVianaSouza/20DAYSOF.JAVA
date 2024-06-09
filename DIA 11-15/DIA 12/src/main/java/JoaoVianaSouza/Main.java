package JoaoVianaSouza;

import JoaoVianaSouza.modelos.Endereco;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.gtbr.ViaCepClient;
import com.gtbr.domain.Cep;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        List<Endereco> enderecos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String cepUser = "";

        while(!cepUser.equalsIgnoreCase("sair")) {
            System.out.println("Bem vindo ao cadastrador de endereços!");
            System.out.println("[AVISO] Caso queira sair, digite 'sair'");

            System.out.println("Digite o seu CEP: ");
            cepUser = leitura.nextLine();
            System.out.println("Digite o número da sua casa: ");
            int casaNum = leitura.nextInt();

            if(cepUser.equalsIgnoreCase("sair")){
                break;
            }

            try {
                Cep cep = ViaCepClient.findCep(cepUser);

                // Criando objeto Endereco com os dados do CEP
                Endereco endereco = new Endereco();
                endereco.setBairro(cep.getBairro());
                endereco.setCep(cep.getCep());
                endereco.setComplemento(cep.getComplemento());
                endereco.setLocalidade(cep.getLocalidade());
                endereco.setLogradouro(cep.getLogradouro());
                endereco.setNumero(casaNum);

                // Adicionando o endereço à lista
                enderecos.add(endereco);

                // Salvando a lista em um arquivo JSON
                FileWriter escrita = new FileWriter("enderecos.json");
                escrita.write(gson.toJson(enderecos));
                escrita.close();

                System.out.println("Endereço salvo com sucesso!");

            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }

    }
}
