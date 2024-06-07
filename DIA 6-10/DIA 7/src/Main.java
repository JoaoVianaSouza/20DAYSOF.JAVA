import exercicio2.Titulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Exercício 1

        // Declarando uma lista de numeros e adicionando números
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(22);
        lista.add(1);
        lista.add(8);
        lista.add(-10);

        // Ordenando em ordem crescente
        Collections.sort(lista);
        System.out.println(lista);


        // Exercício 2

        // Instanciando objetos
        Titulo primeiro = new Titulo("Primeiro");
        Titulo segundo = new Titulo("Segundo");
        Titulo terceiro = new Titulo("O Terceiro");

        // Adicionando os objetos à lista de titulos
        List<Titulo> titulos = new ArrayList<>();
        titulos.add(primeiro);
        titulos.add(segundo);
        titulos.add(terceiro);

        // Ordenando os titulos e imprimindo
        Collections.sort(titulos);
        System.out.println(titulos);

        // Exercício 3

        // Mostrando que uma lista pode se comportar de várias maneiras
        List<String> listaPolimorfica;

        // Usando como uma ArrayList
        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        // Usando como uma LinkedList
        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);


    }
}