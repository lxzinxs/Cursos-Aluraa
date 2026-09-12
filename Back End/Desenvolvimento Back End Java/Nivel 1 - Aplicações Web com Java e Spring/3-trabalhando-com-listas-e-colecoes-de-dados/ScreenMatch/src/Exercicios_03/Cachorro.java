package Exercicios_03;

public class Cachorro extends Animal {
    String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public void abanarRabo() {
        System.out.println(nome + " está abanando o rabo.");
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " fez: Au Au!");
    }
}