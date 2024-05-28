package projeto;


public class Musicas extends Audio {
    private String artista;
    private String genero;
    private String album;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void Musical(){
        FichaTec();
        System.out.println("Artista: " + artista);
        System.out.println("Gênero: " + genero);
        System.out.println("Album: " + album);
    }
}


