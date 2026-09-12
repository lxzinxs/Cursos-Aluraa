package Exercicio_04;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("A area da sala é: " + area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = (2 * (altura * largura));
        System.out.println("O perimetro da sala é: " + perimetro);
    }
}
