package Exercicio_02;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}

