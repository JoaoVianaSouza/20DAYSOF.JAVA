package exercicio_construtor;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;


    // Craindo um contrutor para definir como obrigatoria a declaração de nome, preco e quantidade quando for criar um exercicio1.Produto
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }


    @Override
    public String toString() {
        return "exercicio1.Produto { " +
                "nome= " + nome + '\'' +
                ", preco= " + preco +
                ", quantidade= " + quantidade + " " +
                '}';
    }
}




