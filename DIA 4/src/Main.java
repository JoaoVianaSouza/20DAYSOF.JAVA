import projeto.Audio;
import projeto.Musicas;
import projeto.Podcast;

public class Main {
    public static void main(String[] args) {

        Podcast poscast = new Podcast();
        poscast.setDescricao("Podcast Voltado Para Notícias Diárias");
        poscast.setHost("Vini Tadeu");
        poscast.Estrelas(5);
        poscast.setTitulo("The News");
        poscast.setDuracaoTotal(20);
        poscast.Pod();

        Musicas musica = new Musicas();
        musica.setAlbum("Eu também sou um anjo");
        musica.setArtista("VND");
        musica.setGenero("Hip Hop");
        musica.Estrelas(5);
        musica.setTitulo("Eu também sou um anjo");
        musica.setDuracaoTotal(50);
        musica.Musical();
    }
}

