package Exercicio_01;

public class Carro {
    String modelo;
    int ano;
    String cor;
    int anoAtual = 2026;

    int idadeCarro() {
        return anoAtual - ano;
    }

    void exibirFichaTecnica(){
        System.out.println("modelo do carro é: " + modelo);
        System.out.println("O ano do carro é: " + ano);
        System.out.println("A cor do carro é: " + cor);
        System.out.println("A idade do carro é: " + idadeCarro());
    }

}
