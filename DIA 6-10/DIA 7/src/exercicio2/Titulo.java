package exercicio2;

// Implementando o Comparable para, sempre que for chamado um objeto do tipo Titulo, a sua comparação será de acordo com o seu nome (definido no fim do codigo)
public class Titulo implements Comparable<Titulo>{
    private String nome;

    public Titulo(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Definindo o meio de comparação (o nome)
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    // Definindo o nome do objeto quando for chamado
    @Override
    public String toString() {
        return "Nome: " + this.nome;
    }
}

