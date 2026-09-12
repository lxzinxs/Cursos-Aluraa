package br.com.alura.Desafio.modelos;

public class Preferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é o preferido por todos!");
        } else {
            System.out.println(audio.getTitulo() + " é curtido por todos!");
        }
    }
}
