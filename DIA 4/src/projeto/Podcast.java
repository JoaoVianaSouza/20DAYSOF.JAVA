package projeto;

public class Podcast extends Audio {
    private String host;
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void Pod(){
        FichaTec();
        System.out.println("Host: " + host);
        System.out.println("Descrição: " + descricao);
    }
}


