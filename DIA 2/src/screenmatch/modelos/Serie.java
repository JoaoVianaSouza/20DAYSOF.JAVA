package screenmatch.modelos;

public class Serie extends Titulo { // A classe "Serie" é um "EXTENDS" da classe "Titulo", ou seja, ela vai herdar todos os atributos da classe Titulo

    // Definindo novos atributos específicos para esse objeto
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public int getTemporadas() { // O "Get" é utilizado para fazer com que o valor do atributo possa ser resgatado em outra classe
        return temporadas;
    }

    public void setTemporadas(int temporadas) { // O "Set" é utilizado para fazer com que o valor do atributo possa ser mudado em outra classe
        this.temporadas = temporadas;
    }

    public boolean isAtiva() { // Esse método retorna o valor do atributo "ativa"
        return ativa;
    }

    public void setAtiva(boolean ativa) { // O "Set" é utilizado para fazer com que o valor do atributo possa ser mudado em outra classe
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() { // O "Get" é utilizado para fazer com que o valor do atributo possa ser resgatado em outra classe
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) { // O "Set" é utilizado para fazer com que o valor do atributo possa ser mudado em outra classe
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() { // O "Get" é utilizado para fazer com que o valor do atributo possa ser resgatado em outra classe
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) { // O "Set" é utilizado para fazer com que o valor do atributo possa ser mudado em outra classe
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override // Esse "Override" significa que eu estou sobreescrevendo um método / atributo da classe mãe (Titulo)
    public int getDuracaoEmMinutos() { // Sobreescrevendo o "GetDuracaoEmMinnutos"
        return temporadas * episodiosPorTemporada * minutosPorEpisodio; // Agora ele vai retornar esse calculo
    }
}

