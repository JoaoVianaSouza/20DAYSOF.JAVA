package screenmatch.calculos;
import screenmatch.modelos.Titulo;

public class CalculadoraDeTempo { // Criando um classe independente

    // Atributos
    private int tempoTotal;

    // Método que vai somar na variável "tempo total" a duração em minutos de todos os objetos que herdaram a classe mãe "título"
    public void inclui(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal() { // Vai retornar o tempo total para poder ser exibido
        return tempoTotal;
    }

}

