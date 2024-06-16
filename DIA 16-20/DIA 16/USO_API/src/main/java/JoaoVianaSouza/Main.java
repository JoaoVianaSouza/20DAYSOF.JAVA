package JoaoVianaSouza;

import JoaoVianaSouza.ConsultaLibreTranslate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String texto;
        int lingua;

        System.out.println("Você deseja traduzir para:" +
                "\n 1 - Inglês" +
                "\n 2 - Espanhol" +
                "\n Digite o número de acordo com sua escolha: ");
        lingua = Integer.parseInt(leitura.nextLine());

        System.out.println("Digite o texto em português a ser traduzido: ");
        texto = leitura.nextLine();

        String resposta = ConsultaLibreTranslate.obterTraducao(texto, lingua);
        System.out.println(resposta);
    }
}