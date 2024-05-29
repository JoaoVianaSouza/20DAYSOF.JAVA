package exercicio_instanceof;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }


    @Override
    public String toString() {
        return "Cachorro{" +
                "raca='" + raca + '\'' +
                ", nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                '}';
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}



