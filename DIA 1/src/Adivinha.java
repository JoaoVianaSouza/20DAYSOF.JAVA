import java.util.Random; // Biblioteca para chamar números aleatórios
import java.util.Scanner; // Bibliote responsável por ler a resposta do usuário

public class Adivinha {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in); // Definindo a variável "ask" como a variável scanner
        int num = new Random().nextInt(100); // Definindo a variável num que será responsável por armazenar o numero aleatório entre 0 e 100
        int tentativas; // Variável de tentativas
        int userNum; // Variável que vai armazenar o numero digitado pelo usuário

        for (tentativas = 1; tentativas <= 5; tentativas ++){ // Loop para perguntar ao usuário 5 vezes
            System.out.println("Adivinhe um número entre 0 e 100: "); // Perguntando ao usuário
            userNum = ask.nextInt(); // Armazenando o que o usuário escreveu

            if (userNum == num){ // Se o número digitado pelo usuário for igual ao número gerado automaticamente
                System.out.printf("Você digitou o número %d e o número correto era %d. Parabéns, você venceu", userNum, num);
                break; // A aplicação irá parar
            }
        }

        if (tentativas > 5){ // Se o usuário tentar mais de 5 vezes
            System.out.printf("O número era %d e você não acertou", num);
        }
    }
}
