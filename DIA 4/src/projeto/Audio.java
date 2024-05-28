package projeto;

import java.util.Date;

public class Audio {
    private String titulo;
    private double duracaoTotal;
    private String classificacao;
    private int curtidas;
    private int favorito;

    public void Estrelas(int curtidas){
        if (curtidas <= 2){
            classificacao = "Esse título é pouco recomendado";
        } else if (curtidas <= 4 ){
            classificacao = "Esse titulo é recomendado";
        } else {
            classificacao = "Esse título está bombando !!!";
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracaoTotal() {
        return duracaoTotal;
    }

    public void setDuracaoTotal(double duracaoTotal) {
        this.duracaoTotal = duracaoTotal;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public void FichaTec(){
        System.out.println("Título: " + titulo);
        System.out.println("Duração Total (em minutos): " + duracaoTotal);
        System.out.println("Classificação: " + classificacao);
    }
}

