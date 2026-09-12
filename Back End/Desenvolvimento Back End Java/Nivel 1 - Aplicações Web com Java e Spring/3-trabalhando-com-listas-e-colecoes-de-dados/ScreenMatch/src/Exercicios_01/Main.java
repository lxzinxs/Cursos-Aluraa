package Exercicios_01;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        //Exercicio 01
        Pessoa pessoa = new Pessoa("Lucas", 19);
        System.out.println(pessoa.toString());

        //Exercicio 02
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        //Exercicio 03
        Pessoa pessoa1 = new Pessoa("Vitoria", 18);
        Pessoa pessoa2 = new Pessoa("Luiz", 49);
        Pessoa pessoa3 = new Pessoa("Fernanda", 53);

        listaDePessoas.add(pessoa);
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        //Exercicio 04
        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        //Exercicio 05
        System.out.println("Primeiro " + listaDePessoas.get(0));

        //Exericio 06
        for (int i = 0; i < listaDePessoas.size(); i++) {
            System.out.println(listaDePessoas.get(i));
        }
    }
}
