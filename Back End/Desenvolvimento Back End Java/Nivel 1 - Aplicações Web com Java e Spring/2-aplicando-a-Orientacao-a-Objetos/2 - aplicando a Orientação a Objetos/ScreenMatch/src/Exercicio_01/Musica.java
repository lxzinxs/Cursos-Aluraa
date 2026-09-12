package Exercicio_01;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double somaDasAvaliacoes;
    int numAvaliacoes;

    void avaliaMusica(double nota){
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }

    double mediaAvaliacao(){
        return somaDasAvaliacoes / numAvaliacoes;
    }

    void exibirFichaTecnica(){
        System.out.println("O titulo da música é: " + titulo);
        System.out.println("O artista são: " + artista);
        System.out.println("O ano de lançamento é: " + anoDeLancamento);
        System.out.println("A media das avaliações sao: " + mediaAvaliacao());
    }
}
