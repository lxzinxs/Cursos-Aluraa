package Exercicio_02;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public void verificarIdade(){
        if(idade >= 18){
            System.out.println(nome + " é maior de idade");
        } else {
            System.out.println(nome + " é menor de idade");
        }
    }
}