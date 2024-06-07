package exercicios.projetos;

import exercicios.interfaces.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public void celsiusParaFahrenheit(double celcius){
        double conversorC = (celcius * 1.8) + 32;
        System.out.println("Fahrenheit = " + conversorC);
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        double conversorF = (fahrenheit -32 ) / 1.8;
        System.out.println("Fahrenheit = " + conversorF);
    }


}
