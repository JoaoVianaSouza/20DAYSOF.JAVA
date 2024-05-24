import java.util.Scanner; // Biblioteca utilizada para ler o que o usuário digitar
import static java.lang.System.exit; // Biblioteca que permite que, quando eu digitar "exit()", o programa pare de executar

public class ContaBancaria { // Classe inicial
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in); // Declarando a variável que vai ler o que o usuário digitar
        String nome, conta; // Declarando duas variáveis do tipo String
        int saldoInicial, tipoConta, operacao, deposito, transferir; // Declarando variáveis do tipo inteiro

        System.out.println("Digite seu nome: ");
        nome = ask.nextLine(); // Lendo o que foi digitado pelo usuário - o método "nextLine()" é usado para ler dados do tipo String

        System.out.println("Tipo de conta \n \n 1 - Conta Corrente \n 2 - Conta Poupança \n \n Digite o número que corresponde ao tipo da sua conta : ");
        tipoConta = ask.nextInt(); // Lendo o que foi digitado pelo usuário - o método "nextInt()" é usado para ler dados do tipo Int
        if(tipoConta == 1 ){ // Criando uma condicional para armazenar o tipo de conta de acordo com o que o usuário digitar
            conta = "Conta Corrente";
        } else{
            conta = "Conta Poupança";
        }

        System.out.println("Digite seu saldo atual: ");
        saldoInicial = ask.nextInt(); // Lendo o qeu foi digitado pelo usuário

        System.out.println("Operações \n \n 1 - Consultar Saldo \n 2 - Receber Valor \n 3 - Transferir Valor \n 4 - Sair \n \n Digite o número correspondente à ação que deseja");
        operacao = ask.nextInt(); // Lendo o que foi digitado pelo usuário

        if(operacao == 1){ // Criando condicionais para cada ação
            System.out.printf("O seu saldo atual é de %d reais", saldoInicial); // Neste caso, irá mostrar o saldo inicial. O uso do %d permite incluir uma variável do tipo int dentro de um texto sem precisar concatenar diretamente
        } else if (operacao == 2) {
            System.out.println("Digite o valor a ser depositado: ");
            deposito = ask.nextInt(); // Armazena o valor de depósito
            saldoInicial += deposito; // Junta (soma) o valor depositado ao saldo inicial
            System.out.printf("\n Você depositou %d reais", deposito); // Neste caso, irá mostrar o valor depositado. O uso do %d permite incluir uma variável do tipo int dentro de um texto sem precisar concatenar diretamente
        } else if (operacao == 3) {
            System.out.println("Digite o valor a ser transferido: ");
            transferir = ask.nextInt(); // Armazenando o valor transferido
            System.out.printf("Você transferiu o valor de %d reais", transferir); // Neste caso, irá mostrar o valor transferido. O uso do %d permite incluir uma variável do tipo int dentro de um texto sem precisar concatenar diretamente
            saldoInicial -= transferir; // O valor transferido vai ser subtraído do saldo inicial
        } else if (operacao == 4) {
            exit(0); // Fechar a operação
        } else {
            System.out.println("[ERROR] Digite um valor válido"); // Caso o usuário não digite um número válido, irá aparecer esse erro
        }

    }
}
