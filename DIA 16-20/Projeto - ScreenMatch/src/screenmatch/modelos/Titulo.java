package screenmatch.modelos;

import com.google.gson.annotations.SerializedName;
import screenmatch.Main.TituloOmdb;

// Declarando que a classe pode ser comparada com ela mesma
public class Titulo implements Comparable<Titulo> {

    private String nome;
    private int anoDeLancamento;

    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    // Criando um construtor que obriga a setar um nome do Titulo quando ele for criado
    public Titulo(String nome, int anoDeLancamento ) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    // Fazendo um construtor que faça o tituloOmdb ser compativel com o Titulo
    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        // Criando um exeção caso isso aconteça:
        if(meuTituloOmdb.year().length() > 4){
            throw new ErroDeConversaoDeAnoExeption("Não consegui converter o ano porque tem mais de 4 caracteres");
        }

        this.anoDeLancamento = Integer.parseInt(meuTituloOmdb.year());
        // Como no ano de lançamento, ele passa um numero e uma string "min", vou passar o substring para ler numeros entre a primeira e quarta casa
        this.duracaoEmMinutos = Integer.parseInt(meuTituloOmdb.runtime().substring(0,3).replace(" ", ""));
    }



    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }


    // Definindo o atributo que será usado para comparar, que será o nome
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "[Nome = " + nome +
                ", Ano de lançamento = " + anoDeLancamento + ", " + "Duração (em minutos): " + duracaoEmMinutos + "]";

    }
}