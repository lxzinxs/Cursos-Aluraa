package Exercicios_03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Exercicio_01
        ArrayList<String> listaLinguagens = new ArrayList<>();
        listaLinguagens.add("Java");
        listaLinguagens.add("C#");
        listaLinguagens.add("Javascript");

        for (String linguagens : listaLinguagens) {
            System.out.println(linguagens);
        }
        System.out.println();

        //Exercicio_02-03
        Animal animal = new Animal("Cachorro", 1);

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
        }

        //Exercicio_04
        ArrayList<Produto> listaProduto = new ArrayList<>();

        Produto produto1 = new Produto("Chocolate", 11.99);
        Produto produto2 = new Produto("Bolo", 35.99);
        Produto produto3 = new Produto("Copo da felicidade", 20.99);

        double media = 0;

        listaProduto.add(produto1);
        listaProduto.add(produto2);
        listaProduto.add(produto3);

        System.out.println("Produtos na lista:");
        for (int i = 0; i < listaProduto.size(); i++) {
            System.out.println(listaProduto.get(i).getNome());
            media += listaProduto.get(i).getPreco();
        }
        media = media / listaProduto.size();

        System.out.println("A média de seus preços são: " + media);
        System.out.println();

        //Exercicio_05
        ArrayList<Forma> listaFormas = new ArrayList<>();

        Circulo circulo = new Circulo();
        circulo.raio = 10;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 6;

        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        for (int i = 0; i < listaFormas.size(); i++) {
            System.out.println("Área: " + listaFormas.get(i).calcularArea());
        }
        System.out.println();

        //Exercicio_06
        ContaBancaria contaBancaria1 = new ContaBancaria(101, 1000);
        ContaBancaria contaBancaria2 = new ContaBancaria(102, 100000);
        ContaBancaria contaBancaria3 = new ContaBancaria(103, 9);
        ContaBancaria contaBancaria4 = new ContaBancaria(104, 12.87);

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(contaBancaria1);
        listaContas.add(contaBancaria2);
        listaContas.add(contaBancaria3);
        listaContas.add(contaBancaria4);

        ContaBancaria maiorSaldo = listaContas.get(0);

        for(int i = 1; i < listaContas.size(); i ++) {
            if(listaContas.get(i).getSaldo() > maiorSaldo.getSaldo()) {
                maiorSaldo = listaContas.get(i);
            }
        }
        System.out.println("Conta com o maior saldo - Número: " + maiorSaldo.getNumeroConta() + ", Saldo: " + maiorSaldo.getSaldo());
    }
}