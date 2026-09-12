package Exercicio_04;

public class Main {
    public static void main() {
        String separar = "********************************";

        //Exercicio_01
        System.out.println(separar);
        System.out.println("----------Exercicio 01----------");
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        conversorMoeda.converterDolarParaReal(100);
        System.out.println("\n");

        //Exercicio_02
        System.out.println(separar);
        System.out.println("----------Exercicio 02----------");
        CalculadoraSalaRetangular calcularsala = new CalculadoraSalaRetangular();
        calcularsala.calcularArea(15, 35);
        calcularsala.calcularPerimetro(15, 35);
        System.out.println("\n");

        //Exercicio_03
        System.out.println(separar);
        System.out.println("----------Exercicio 03----------");
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(10);
        System.out.println("\n");

        //Exercicio_04
        System.out.println(separar);
        System.out.println("----------Exercicio 04----------");
        ConversorTemperaturaPadrao temperatura = new ConversorTemperaturaPadrao();
        temperatura.celsiusParaFahrenheit(28);
        temperatura.fahrenheitParaCelsius(82.4);
        System.out.println("\n\n");

        //Exercicio_05
        System.out.println(separar);
        System.out.println("----------Exercicio 05----------");
        Livro livro = new Livro();
        ProdutoFisico produtoFisico = new ProdutoFisico();
        System.out.println("O preço do livro é: " + livro.calcularPrecoFinal());
        System.out.println("O preço do produto é: " + produtoFisico.calcularPrecoFinal());
        System.out.println("\n");

        //Exercicio_06
        System.out.println(separar);
        System.out.println("----------Exercicio 06----------");
        Produto produto = new Produto();
        Servico servico = new Servico();
        produto.calcularPrecoTotal(100);
        servico.calcularPrecoTotal(100);
    }
}
