package exercicios.projetos;

import exercicios.interfaces.Calculavel;

public class Livro implements Calculavel {

    @Override
    public void calcularPrecoFinal(double preco) {
        if (preco <= 25){
            double precoFinal = preco + 1.80;
            System.out.printf("zn O preco final desse livro é de: %.2f reais \n", precoFinal);
        } else if (preco <= 50 ) {
            double precoFinal = preco + 3.60;
            System.out.printf("zn O preco final desse livro é de: %.2f reais \n", precoFinal);
        } else if (preco <= 100 ) {
            double precoFinal = preco + 7.20;
            System.out.printf("zn O preco final desse livro é de: %.2f reais \n", precoFinal);
        } else {
            double precoFinal = preco + 10;
            System.out.printf("zn O preco final desse livro é de: %.2f reais \n", precoFinal);
        }
    }
}
