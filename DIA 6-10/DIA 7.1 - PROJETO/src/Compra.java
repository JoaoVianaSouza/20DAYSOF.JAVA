// Criando o escopo do objeto compra

// A implementação do Comparable<Compra> foi necessária para definir a forma de comparação que será feita quando um objeto do tipo Compra for comparado com outro
public class Compra implements Comparable<Compra> {
    private String descricao;
    private double valor;

    // Definindo que será sempre obrigatório atribuir valor aos seguintes atributos assim que o objeto for instanciado
    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    // Definindo como será mostrado o objeto quando ele for printado na tela
    @Override
    public String toString() {
        return "Compra: descricao = " + descricao +
                " valor =" + valor;
    }

    // Definindo o método de comparação do objeto
    @Override
    public int compareTo(Compra outraCompra) {
        // Será comparado a partir do valor utilizando o seguinte método:
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}

