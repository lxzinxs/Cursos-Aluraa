package Exercicio_01;

public class Exercicios {
    public static void main(String[] args) {
        //Exercicio_01
        Pessoa pessoa = new Pessoa();
        pessoa.olaMundo();
        System.out.println("\n");

        //Exercicio_02
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobroNumero(10);
        System.out.println(resultado);
        System.out.println("\n");

        //Exercicio_03
        Musica musica = new Musica();
        musica.titulo = "Trocaria Tudo";
        musica.artista = "Marcos & Fernando, Henrique & Juliano";
        musica.anoDeLancamento = 2014;
        musica.avaliaMusica(10);
        musica.avaliaMusica(8);
        musica.avaliaMusica(9);
        musica.exibirFichaTecnica();
        System.out.println("\n");

        //Exercicio_04
        Carro carro = new Carro();
        carro.modelo = "Mclaren p1";
        carro.ano = 2013;
        carro.cor = "Roxo";
        carro.exibirFichaTecnica();
        System.out.println("\n");

        //Exercicio_05
        Aluno aluno = new Aluno();
        aluno.nome = "Lucas";
        aluno.idade = 19;
        aluno.exibirInformacoes();
    }
}
