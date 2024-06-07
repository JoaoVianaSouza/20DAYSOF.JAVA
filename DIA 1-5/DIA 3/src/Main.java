package exercicios.interfaces;

import exercicios.projetos.CalculadoraSalaRetangular;
import exercicios.projetos.ConversorMoeda;
import exercicios.projetos.ConversorTemperaturaPadrao;
import exercicios.projetos.TabuadaMultiplicacao;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        conversor.converterDolarParaReal(40);

        CalculoGeometrico calculos = new CalculadoraSalaRetangular();
        calculos.calcularArea(30, 40);
        calculos.calcularPerimetro(10,20);

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(3);

        ConversorTemperaturaPadrao temperatura = new ConversorTemperaturaPadrao();
        temperatura.celsiusParaFahrenheit(20);
        temperatura.fahrenheitParaCelsius(50);


    }
}
