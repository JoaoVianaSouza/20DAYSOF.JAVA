package exercicio_construtor;

public class ProdutoPerecivel extends Produto{
    private int dataValidade;


    public ProdutoPerecivel(String nome, double preco, int quantidade, int dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }


    public int getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(int dataValidade) {
        this.dataValidade = dataValidade;
    }


    // Reescrevendo a chamada do objeto ProdutoPereciavel e adicionando a data de validade
    @Override
    public String toString() {
        return "exercicio1.ProdutoPerecivel { " +
                "nome= " + getNome() + '\'' +
                ", preco= " + getPreco() +
                ", quantidade= " + getQuantidade() +
                ", dataValidade= " + dataValidade +
                " }";
    }
}




