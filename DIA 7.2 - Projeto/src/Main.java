import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            // Definindo a variável responsável por ler o que o usuário digitar
            Scanner leitura = new Scanner(System.in);

            // Primeira pergunta para o usuário
            System.out.println("Digite o limite do cartão: ");

            // O valor digitado pelo usuário será armazenado na variável "limite"
            double limite = leitura.nextDouble();
            // Criando um objeto do tipo cartão de crédito e setando o limite dele de acordo com o qeu foi digitado pelo usuário
            CartaoDeCredito cartao = new CartaoDeCredito(limite);

            // Criando um loop para a pessoa armazenar as compras
            int sair = 1; // Se sair for igual a 0, o loop irá parar
            while(sair != 0) {
                System.out.println("Digite a descrição da compra: ");
                // Armazenando a descrição da compra
                String descricao = leitura.next();

                System.out.println("Digite o valor da compra: ");
                // Armazenando o valor da compra
                double valor = leitura.nextDouble();

                // Criando um objeto do tipo Compra e instanciando sua descrição e valor de acordo com o que o usuário digitou
                Compra compra = new Compra(descricao, valor);

                // Definindo uma variavel que vai armazenar o método lancaCompra
                boolean compraRealizada = cartao.lancaCompra(compra);

                // Se lancaCompra for verdadeiro, irá realizar as operações presentes no método e em seguida:
                if (compraRealizada) {
                    System.out.println("Compra realizada!");
                    System.out.println("Digite 0 para sair ou 1 para continuar");
                    sair = leitura.nextInt();
                } else {
                    // Caso contrário, sairá do loop;
                    System.out.println("Saldo insuficiente!");
                    sair = 0;
                }
            }

            // Quando o loop terminar:
            System.out.println("COMPRAS REALIZADAS:\n");

            // Mostrará todas as compras em ordem de valor (menor para o maior)
            // Para cada compra na lista de compras...
            Collections.sort(cartao.getCompras());
            for (Compra compra : cartao.getCompras()) {
                System.out.println(compra.getDescricao() + " - " +compra.getValor());
            }
            System.out.println("\nSaldo do cartão: " +cartao.getSaldo());
        }


    }