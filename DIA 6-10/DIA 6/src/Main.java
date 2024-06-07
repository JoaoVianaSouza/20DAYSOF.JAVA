import exercicio_construtor.Produto;
import exercicio_construtor.ProdutoPerecivel;
import exercicio_instanceof.Animal;
import exercicio_instanceof.Cachorro;
import exercicio_foreach.Chocolate;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Exercício Construtor

        // Criando um produto e preenchendo seus atributos com o contrutar definindo que, para o objeto ser criado, ele presica passar as informações obrigatórias.
        Produto produtoA = new Produto("Arroz", 31.87,7);

        // Criando um produto pereciavel e preenchendo seus atributos com o contrutar definindo que, para o objeto ser criado, ele presica passar as informações obrigatórias.
        ProdutoPerecivel produtoB = new ProdutoPerecivel("Óleo", 8.90, 30, 12092024);

        // Criando uma lista de produtos e adicionando produtoA e produtoB
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produtoA);
        produtos.add(produtoB);

        System.out.println(produtos.size());
        System.out.println(produtos.get(1));


        // Exercício InstanceOf

        // Criando um objeto Cachorro
        Cachorro dog = new Cachorro("Ted", 12, "Pug");

        // Utilizando o instanceOf para garantir que o tipo de dado que está sendo passado seja realmente o que eu quero.
        if(dog instanceof Cachorro){
            // Fazendo o casting, ou seja, criando um objeto animal que vai receber o objeto dog em formato de Animal
            Animal animal = (Animal) dog;
        }

        // Exercício For (MÉDIA)

        // Criando um produto
        Chocolate aoLeite = new Chocolate("Cookies and Cream", 9.8);
        Chocolate meioAmargo = new Chocolate("Strong", 12);
        Chocolate branco = new Chocolate("Laka", 8.90);

        ArrayList<Chocolate> lista = new ArrayList<>();
        lista.add(aoLeite);
        lista.add(meioAmargo);
        lista.add(branco);

        // Criando um loop para calcular e imprimir o preço médio dos produtos

        double somaPrecos = 0;
        for (Chocolate item: lista){
            somaPrecos += item.getPreco();
        }

        // Paraachar a média, basta dividir o valor total somado pelo numero de itens na lista
        double mediaPreco = somaPrecos / lista.size();
        System.out.printf("\nPreço médio dos chocolates: %.2f", mediaPreco);


    }
}

