import java.util.ArrayList;
import java.util.List;

// Definindo os atributos do cartão de crédito e uma lista de compras que será linkada à classe "Compra"
public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    // Definindo que será sempre obrigatório atribuir valor ao limite assim que o objeto for instanciado
    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    // Definindo um método para cada compra que for realizada. Ele irá retornar true caso o valor da compra for menor que o saldo, diminuido assim o valor do saldo e adicionará a compra, e, caso contrário, ele retornará falso
    public boolean lancaCompra(Compra compra) {
        if(this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}

