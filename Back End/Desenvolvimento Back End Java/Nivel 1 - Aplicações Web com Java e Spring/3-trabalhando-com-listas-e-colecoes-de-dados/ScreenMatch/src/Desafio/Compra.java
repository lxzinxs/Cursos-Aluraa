package Desafio;

public class Compra implements Comparable<Compra> {
    private String carrinho;
    private double valor;

    public Compra(String carrinho, double valor) {
        this.carrinho = carrinho;
        this.valor = valor;
    }

    public String getCarrinho() {
        return carrinho;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: \nCarrinho = " + carrinho + " valor: " + valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
