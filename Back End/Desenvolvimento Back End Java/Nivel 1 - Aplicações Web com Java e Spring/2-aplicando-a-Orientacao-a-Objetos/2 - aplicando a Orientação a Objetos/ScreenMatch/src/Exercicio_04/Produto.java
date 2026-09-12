package Exercicio_04;

public class Produto implements Vendavel{
    double valor = 100;

    @Override
    public void calcularPrecoTotal(int quantidade) {
        if (quantidade > 10) {
            double valorTotal = valor * (0.5);
            valorTotal = valorTotal * quantidade;
            System.out.println("O valor é: " + valorTotal);
        } else {
            double valorTotal = valor * (0.1);
            valorTotal = valorTotal * quantidade;
            System.out.println("O valor é: " + valorTotal);
        }
    }
}