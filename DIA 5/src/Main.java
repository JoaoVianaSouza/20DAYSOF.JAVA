import java.util.ArrayList;
import classes.Pessoa;

public class Main {
    public static void main(String[] args) {
        // Declarando os objetos do tipo "Pessoa"
        Pessoa fulano = new Pessoa();
        Pessoa ciclano = new Pessoa();

        // Preenchendo os atributos das Pessoas
        fulano.setIdade(12);
        fulano.setNome("João");

        ciclano.setNome("Maria");
        ciclano.setIdade(19);

        // Criando a lista
        ArrayList<Pessoa> listaDePessoas= new ArrayList<>();
        // Adicionando as pessoas criadas na lista
        listaDePessoas.add(ciclano);
        listaDePessoas.add(fulano);

        // Imprimindo o tamanho (quantas pessoas tem) da lista
        System.out.println(listaDePessoas.size());
        // Imprimindo a primeira pessoa inserida na lista
        System.out.println(listaDePessoas.get(0));
        // Imprimindo toda a lista - Isso só é possivel graças ao Overwrite que está na classe Pessoa
        System.out.println(listaDePessoas);

    }
}

