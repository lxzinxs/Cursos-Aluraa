package Exercicio_03;

public class ContaBancaria {
    public double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if(saldo >= valor){
            saldo -= valor;
        } else {
            System.out.println("Operação impossivel ser realizada!");
        }
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo é: " + saldo);
    }
}
