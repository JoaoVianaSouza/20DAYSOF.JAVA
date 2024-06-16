package screenmatch.Main;

import screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.calculos.FiltroRecomendacao;
import screenmatch.modelos.Episodio;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando um filme passando seu nome e ano de lançamento
        Filme meuFilme = new Filme("O Poderoso Chefão", 2005);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        // Criando um filme passando seu nome e seu ano de lançamento
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        // Criando uma série passando seu nome e seu ano de lançamento
        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        // Criando um filme passando seu nome
        Filme terceiroFilme = new Filme("Meu Malvado Favorito", 2004);
        terceiroFilme.setDuracaoEmMinutos(200);
        terceiroFilme.avalia(5);

        // Utilizando listas
        
        // Construindo a lista
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        // Inserindo os filmes
        listaDeFilmes.add(terceiroFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);

        // Mostrando quantos elementos tem na lista
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());

        // Mostrando o nome do primeiro filme da lista
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());

        // Mostrando a lista toda
        System.out.println(listaDeFilmes);


    }
}