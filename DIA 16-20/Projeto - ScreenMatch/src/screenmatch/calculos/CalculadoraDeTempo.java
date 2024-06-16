package screenmatch.calculos;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;
import screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

   public void inclui(Filme f) {
     this.tempoTotal += f.getDuracaoEmMinutos();
    }

    public void inclui(Serie s) {
       this.tempoTotal += s.getDuracaoEmMinutos();
   }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}