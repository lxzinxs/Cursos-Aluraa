package Exercicios_02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 =  new Produto("Chocolate", 12, 3);
        Produto produto2 = new Produto("Bombom", 20, 2);

        Produto produtoNovo = new Produto("Produto Novo", 100, 10);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);

        System.out.println("O tamanho da lista é: " + listaProdutos.size());

        //Exercicio 01
        /***for(int i = 0; i < listaProdutos.size(); i++) {
            System.out.println("O produto da posição " + (i + 1) + " é: " + listaProdutos.get(i).getNome());
        }***/

        //Exercicio 02
        for (Produto produto : listaProdutos) {
            System.out.println(produto);
            //Exercicio 03
            System.out.println(produtoNovo);
        }

        //Exercicio 04
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("morango", 12.99, 19, 2026);
        System.out.println(produtoPerecivel);
    }
}
