package br.com.alura.Desafio.modelos;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducao;
    private int totalDeCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void curte() {
        this.totalDeCurtidas++;
    }

    public void reproduz() {
        this.totalDeReproducao++;
    }
}