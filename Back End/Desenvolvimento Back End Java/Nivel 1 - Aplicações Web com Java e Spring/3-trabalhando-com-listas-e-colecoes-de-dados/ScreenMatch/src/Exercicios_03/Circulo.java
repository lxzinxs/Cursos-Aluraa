package Exercicios_03;

public class Circulo implements Forma{
    double raio;

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
