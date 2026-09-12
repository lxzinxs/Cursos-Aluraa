package Exercicios_04;

public class Titulo implements Comparable<Titulo> {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome= nome;
    }

    @Override
    public String toString() {
        return "Titulo: " + this.getNome();
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.getNome());
    }
}
