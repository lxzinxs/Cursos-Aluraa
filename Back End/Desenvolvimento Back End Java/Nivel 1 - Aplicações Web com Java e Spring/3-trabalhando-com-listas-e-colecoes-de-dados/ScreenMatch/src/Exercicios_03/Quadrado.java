package Exercicios_03;

public class Quadrado implements Forma{
    double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
