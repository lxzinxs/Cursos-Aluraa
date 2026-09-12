package br.com.alura.Desafio.modelos;

public class Musica extends Audio{
    String album;
    String cantor;
    String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String artista) {
        this.cantor = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalDeReproducao() > 500) {
            return 10;
        } else {
            return 6;
        }
    }
}
