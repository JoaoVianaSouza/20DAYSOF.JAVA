// Fazendo os imports necessários

import screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;


public class Main { // Definindo a classe que vai rodar
    public static void main(String[] args) {
        Filme favorito = new Filme(); // Criando um objeto Filme
        // Instanciando elementos
        favorito.setNome("The matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        Filme outro = new Filme();  // Criando um objeto Filme
        // Instanciando elementos
        outro.setNome("Jonh Wikk");
        outro.setAnoDeLancamento(2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);

        Serie serie = new Serie();  // Criando um objeto Serie
        // Instanciando elementos
        serie.setNome("La Casa de Papel");
        serie.setAnoDeLancamento(2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo(); // Criando uma calculadora

        // Incluindo os parametros da calculadora
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(serie);

        System.out.println("Tempo total: " +calculadora.getTempoTotal());
    }
}
