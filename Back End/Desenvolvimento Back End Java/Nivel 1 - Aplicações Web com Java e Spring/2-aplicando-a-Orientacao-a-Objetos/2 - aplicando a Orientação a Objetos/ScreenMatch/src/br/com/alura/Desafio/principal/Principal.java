package br.com.alura.Desafio.principal;

import br.com.alura.Desafio.modelos.Musica;
import br.com.alura.Desafio.modelos.Podcast;
import br.com.alura.Desafio.modelos.Preferidas;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Famoso Imã");
        musica.setCantor("Mc Lele JP, Mc Poze do Rodo, MC Leozinho ZS, DJ GORDINHO DA VF");

        for(int i = 0; i < 1000; i++) {
            musica.reproduz();
        }

        for(int i = 0; i < 50; i++) {
            musica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("Podpah");
        podcast.setApresentador("Igor Cavalari e Thiago Marques");

        for (int i = 0; i < 1000; i++) {
            podcast.reproduz();
        }
        for (int i = 0; i < 100; i++) {
            podcast.curte();
        }

        Preferidas preferidas = new Preferidas();
        preferidas.inclui(musica);
        preferidas.inclui(podcast);
    }
}
