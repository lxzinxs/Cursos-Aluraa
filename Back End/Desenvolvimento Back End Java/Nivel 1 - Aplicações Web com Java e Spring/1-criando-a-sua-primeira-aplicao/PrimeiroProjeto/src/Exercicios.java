import java.util.Scanner;
import java.util.Random;

public class Exercicios {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("""
                Escolha o exercicio que deseja acessar:
                [ 1 ] - Temperatura
                [ 2 ] - Média
                [ 3 ] - Nome
                [ 4 ] - Valor total
                [ 5 ] - Conversão
                [ 6 ] - Desconto
                [ 7 ] - Jogo de advinhação
                [ 8 ] - Positivo ou negativo
                [ 9 ] - Maior ou menor
                [ 10 ] - Calcular area
                [ 11 ] - Tabuada
                [ 12 ] - Par ou ímpar
                [ 13 ] - Fatorial
                """);
        int opcao = teclado.nextInt();

        switch (opcao){
            case 1:
                Exercicio_01();
                break;
            case 2:
                Exercicio_02();
                break;
            case 3:
                Exercicio_03();
                break;
            case 4:
                Exercicio_04();
                break;
            case 5:
                Exercicio_05();
                break;
            case 6:
                Exercicio_06();
                break;
            case 7:
                JogoDeAdivinhacao();
                break;
            case 8:
                Exercicio_08();
                break;
            case 9:
                Exercicio_09();
                break;
            case 10:
                Exercicio_10();
                break;
            case 11:
                Exercicio_11();
                break;
            case 12:
                Exercicio_12();
                break;
            case 13:
                Exercicio_13();
                break;
            default:
                System.out.println("Digite uma opção válida!");
                break;
        }
        teclado.close();
    }

    //Exercicio 01
    public static void Exercicio_01() {
        double celsius = 37.0;
        double fahrenheit;

        fahrenheit = (celsius * 1.8) + 32;

        System.out.printf("37 em Celsius é o mesmo que %.2f em fahrenheit", fahrenheit);
    }

    //Exercicio 02
    public static void Exercicio_02() {
        double nota1 = 8.3;
        double nota2 = 3.4;

        double media = (nota1 + nota2) / 2;

        System.out.printf("A média das notas é %.2f", media);
    }

    //Exercicio 03
    public static void Exercicio_03() {
        char letra = 'V';
        String texto = "A primeira letra do nome da minha namorada é: ";

        System.out.println(texto + letra + "!");
    }

    //Exercicio 04
    public static void Exercicio_04() {
        double precoProduto = 127.56;
        int quantidade = 6;

        double valorTotal = precoProduto * quantidade;

        System.out.printf("O valor total é: %.2f", valorTotal);
    }

    //Exercicio 05
    public static void Exercicio_05() {
        double valorEmDolares = 657.75;
        double reais = 4.94;

        double valorEmReais = valorEmDolares * reais;

        System.out.printf("O valor em reais é: %.2f", valorEmReais);
    }

    //Exercicio 06
    public static void Exercicio_06() {
        double precoOriginal = 100.00;
        double percentualDesconto = 10;

        double desconto = ((precoOriginal) * (percentualDesconto / 100));
        double total = precoOriginal - desconto;

        System.out.printf("O valor com desconto é: %.2f", total);
    }

    //Jogo advinhação
    public static void JogoDeAdivinhacao() {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        int gerador = aleatorio.nextInt(0, 100);
        int chute = 0;
        int tentativas = 0;

        while (gerador != chute){
            System.out.println("Digite o número entre 1 e 100: ");
            chute = teclado.nextInt();
            tentativas++;

            if (chute == gerador){
                System.out.println("Parabéns você acertou o número secreto com " + tentativas + " tentativas!");
            } else if (chute < gerador) {
                System.out.println("O número secreto é maior!");
            } else {
                System.out.println("Número inválido!");
            }
        }
    }

    //Exercicio 08
    public static void Exercicio_08() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = teclado.nextInt();
        if (numero > 0) {
            System.out.println("Seu número é positivo!");
        } else if (numero < 0) {
            System.out.println("Seu número é negativo!");
        } else {
            System.out.println("Seu número é nulo!");
        }
    }

    //Exercicio 09
    public static void Exercicio_09() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva dois números inteiros: ");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();

        if(num1 == num2) {
            System.out.println("Eles são números iguais!");
        } else {
            System.out.println("Eles são números diferentes!");
            if(num1 > num2) {
                System.out.println("O número " + num1 + " é maior que " + num2);
            } else {
                System.out.println("O número " + num1 + " é menor que " + num2);
            }
        }
    }

    //Exercicio 10
    public static void Exercicio_10() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("----Menu----\n1 - calcular area do quadrado\n2 - calcular area do circulo");
        int opcao = teclado.nextInt();

        double pi = 3.14;

        switch (opcao) {
            case 1:
                System.out.println("Digite a medida de um lado do quadrado: ");
                double medidaQuadrado = teclado.nextDouble();
                double areaQuadrado = medidaQuadrado * medidaQuadrado;
                System.out.println("A area é " + areaQuadrado);
            case 2:
                System.out.println("Digite a medida do raio do circulo: ");
                double raioCirculo = teclado.nextDouble();
                double areaCirculo = (pi * (raioCirculo * raioCirculo));
                System.out.printf("A area é %.2f", areaCirculo);
        }
    }

    //Exercicio 11
    public static void Exercicio_11() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número para saber a tabuada: ");
        int num = teclado.nextInt();
        int resultado = 0;
        int soma = 0;
        System.out.println("Tabuada do número " + num);
        for (int i = 1; i <= 10; i++) {
            resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }

    //Exercicio 12
    public static void Exercicio_12() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número para saber se é par ou ímpar: ");
        int num = teclado.nextInt();
        if (num % 2 == 0) {
            System.out.println("Seu número é par!");
        } else {
            System.out.println("Seu número é ímpar!");
        }
    }

    //Exercicio 13
    public static void Exercicio_13() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número para saber seu valor fatorial: ");
        int num = teclado.nextInt();
        int fatorial = 1;

        for (int i = num; i > 1; i--) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + num + " é: " + fatorial);
    }
}