package br.com.alura.Desafio.modelos;

public class Podcast extends Audio{
    private String apresentador;
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalDeCurtidas() > 500){
            return 10;
        } else {
            return 6;
        }
    }
}