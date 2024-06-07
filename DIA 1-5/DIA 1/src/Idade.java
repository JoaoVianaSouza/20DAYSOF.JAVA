import java.util.Scanner; // Biblioteca responsável pelo "Scaner", o respondável por fazer leitura dos dados


public class Idade { // Classe padrão java
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); // Declarando a variavel de leitura, que vai receber as informações do usuário

        System.out.println("Digite seu nome: "); 
        String nome = leitura.nextLine(); // Lendo o que foi digitado pelo usuário - o método "nextLine()" é usado para ler Strings
        System.out.printf("Seu nome é %s", nome); // O uso do %s permite incluir uma variável do tipo string dentro de um texto sem precisar concatenar diretamente
        System.out.println(" Digite sua idade: ");
        int idade = leitura.nextInt(); // Lendo o que foi digitado pelo usuário - o método "nextInt()" é usado para ler Inteiros
        System.out.printf("Você tem %d anos", idade); // O uso do %d permite incluir uma variável  do tipo int dentro de um texto sem precisar concatenar diretamente

        if(idade < 18){ // Criando uma condicional simples para mostrar na tela se a pessoa é maior ou menor de idade
            System.out.println("Você é menor de idade");
        } else{
            System.out.println("Você é maior de idade");
        }
    }
}
