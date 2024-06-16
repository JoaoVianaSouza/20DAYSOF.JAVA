package screenmatch.Main;

import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;
import screenmatch.modelos.Titulo;

import java.util.*;

public class MainComListas {
    public static void main(String[] args) {
        // Criando um filme passando seu nome e ano de lançamento
        Filme meuFilme = new Filme("O Poderoso Chefão", 2005);
        meuFilme.avalia(9);

        // Criando um filme passando seu nome e seu ano de lançamento
        Filme outroFilme = new Filme("Avatar", 2023);
        meuFilme.avalia(8);

        // Criando uma série passando seu nome e seu ano de lançamento
        Serie lost = new Serie("Lost", 2000);
        lost.avalia(10);

        // Criando um filme passando seu nome
        Filme terceiroFilme = new Filme("Meu Malvado Favorito", 2004);
        terceiroFilme.avalia(10);

        // Construindo a lista de filmes e séries
        ArrayList<Titulo> lista = new ArrayList<>();

        // Inserindo os filmes
        lista.add(terceiroFilme);
        lista.add(outroFilme);
        lista.add(meuFilme);
        lista.add(lost);

        // Para cada item na minha lista, você vai imprimir titulo por titulo
        for (Titulo item: lista) {
            System.out.println(item.getNome());

            // Se o item é uma Filme..... FAÇA
            if (item instanceof Filme){
                Filme filme = (Filme) item; // Tranformando "item" em "filme" para conseguir ver a classificação
                System.out.println("Classificação: " + filme.getClassificacao()); // Ele vai dar erro no fim pois tem uma série dentro dessa lista e meu item agora só pode ser filme
            }

            // Ordenando Listas
            List<String> buscaPorArtista = new ArrayList<>();
            buscaPorArtista.add("Adam Sandler");
            buscaPorArtista.add("João Pedro");
            buscaPorArtista.add("Carla");
            buscaPorArtista.add("Maria");

            Collections.sort(buscaPorArtista);
            System.out.println("Artistas Ordenados: ");
            System.out.println(buscaPorArtista);

            // Para ordenar os titulos, foi preciso implmentar o comparer to na classe titulo
            System.out.println("Lista de títulos ordenados: ");
            Collections.sort(lista);
            System.out.println(lista);

            // Comparando de acordo com o ano de lançamento
            lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento ));
            System.out.println("Ordenando por ano: ");
            System.out.println(lista);

        }
    }
}
