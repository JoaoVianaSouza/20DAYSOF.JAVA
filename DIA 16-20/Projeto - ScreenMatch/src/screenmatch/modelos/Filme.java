package screenmatch.modelos;
import screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    // Importando o construtor que estrá escrito na classe Titulo
    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    // Reescrevendo um método que já vem pronto no JAVA, que é o toString(). Estarei reescrevendo isso pois quero devolver um valor diferente quando pedir para retornar o valor da classe
    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}