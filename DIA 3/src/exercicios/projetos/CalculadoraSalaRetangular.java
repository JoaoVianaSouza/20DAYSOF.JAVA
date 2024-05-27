package exercicios.projetos;

import exercicios.interfaces.CalculoGeometrico;

public class CalculadoraSalaRetangular  implements CalculoGeometrico {

    @Override
    public void calcularArea(double altura, double largura){
        double area = altura * largura;
        System.out.printf("A área mede %.2f \n", area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura){
        double perimero = (altura*2) + (largura*2);
        System.out.printf("O perímetro mede %.2f \n", perimero);
    }



}
