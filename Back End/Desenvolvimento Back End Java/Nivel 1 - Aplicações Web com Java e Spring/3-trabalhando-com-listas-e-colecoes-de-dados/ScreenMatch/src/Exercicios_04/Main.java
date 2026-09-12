package Exercicios_04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Exercicio_01
        System.out.println("Exercicio_01");
        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(10);
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(21);

        Collections.sort(listaNumeros);
        System.out.println(listaNumeros);
        System.out.println();

        //Exercicio_02-03
        System.out.println("Exercicio_02-03");
        Titulo titulo1 = new Titulo();
        Titulo titulo2 = new Titulo();
        Titulo titulo3 = new Titulo();
        Titulo titulo4 = new Titulo();

        titulo1.setNome("Capitão America");
        titulo2.setNome("Homem Aranha");
        titulo3.setNome("Hulk");
        titulo4.setNome("Homem de Ferro");

        List<Titulo> listaTitulo = new ArrayList<>();
        listaTitulo.add(titulo1);
        listaTitulo.add(titulo2);
        listaTitulo.add(titulo3);
        listaTitulo.add(titulo4);

        System.out.println("Lista sem ordem alfabetica: ");
        System.out.println(listaTitulo);

        Collections.sort(listaTitulo);
        System.out.println("Lista em ordem alfabetica");
        System.out.println(listaTitulo);
        System.out.println();

        //Exercicio_04
        System.out.println("Exercicio_04");
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        arrayList.add("Objeto 1");
        arrayList.add("Objeto 2");

        linkedList.add("Objeto A");
        linkedList.add("Objeto B");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
        System.out.println();

        //Exercicio_05
        System.out.println("Exercicio_05");
        List<String> lista;

        lista = new ArrayList<>();
        lista.add("Objeto 1");
        lista.add("Objeto 2");
        System.out.println("ArrayList: " + lista);

        lista = new LinkedList<>();
        lista.add("Objeto 1");
        lista.add("Objeto 2");
        System.out.println("LinkedList: " + lista);


    }
}
