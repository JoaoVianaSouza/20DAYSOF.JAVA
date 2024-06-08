package exercicioConta;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int dividendo;
        int divisor;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Bem vindo à calculadora ");
        System.out.println("Digite o dividendo: ");
        dividendo = leitura.nextInt();
        System.out.println("Digite o divisor: ");
        divisor = leitura.nextInt();

        // Trabalhando com exeções. Caso o divisor seja 0, irá aparecer uma menssagem de erro

        try{
            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e){
            System.out.println("[ERRO] DIVISÃO POR 0");
        }



    }
}