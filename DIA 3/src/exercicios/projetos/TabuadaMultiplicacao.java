package exercicios.projetos;

import exercicios.interfaces.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(int numero){
        for (int num = 0; num <= 10; num++){
            System.out.print("\n" + numero + " x " + num + " = " + (numero*num) + "\n");
        }
    }
}
