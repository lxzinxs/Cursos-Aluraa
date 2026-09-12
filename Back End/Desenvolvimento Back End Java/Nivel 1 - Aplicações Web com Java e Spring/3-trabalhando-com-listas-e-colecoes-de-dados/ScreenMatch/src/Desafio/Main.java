package Desafio;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o limite do seu cartão: ");
        double limite = teclado.nextInt();
        Cartao cartao = new Cartao(limite);
        teclado.nextLine();

        boolean continuar = true;

        while(continuar) {
            System.out.print("\nDigite o nome da compra que deseja efetuar: ");
            String carrinho = teclado.nextLine();

            System.out.print("Digite o valor da compra: ");
            double valor = teclado.nextInt();

            Compra compra = new Compra(carrinho, valor);
            boolean compraRealizada = cartao.validarCompra(compra);

            if(compraRealizada) {
                System.out.println("\nCompra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar: ");
                int acao = teclado.nextInt();
                teclado.nextLine();
                if(acao == 1) {
                    continuar = true;
                } else {
                    continuar = false;
                }
            } else {
                System.out.println("Saldo insuficiente!");
                continuar = false;
            }
        }

        System.out.println("\nCompras Realizadas: ");

        Collections.sort(cartao.getCompras());

        for(Compra c : cartao.getCompras()) {
            System.out.println(c.getCarrinho() + " = " + c.getValor());
        }
        System.out.println("Saldo do cartão: " + cartao.getSaldo());
    }
}
