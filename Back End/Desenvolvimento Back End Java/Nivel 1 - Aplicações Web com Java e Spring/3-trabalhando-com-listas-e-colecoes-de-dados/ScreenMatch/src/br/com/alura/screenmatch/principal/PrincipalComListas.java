package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoLucas = new Filme("Dogville", 2003);
        filmeDoLucas.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        //Filme f1 = filmeDoLucas;

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoLucas);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        //lista.add(f1);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Ordenar por ordem");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos em ordem");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println("Ordenado por ano");
        System.out.println(lista);
    }
}