import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String resposta = teclado.nextLine();
        System.out.println("Qual o ano de lançamento? ");
        int resposta2 = teclado.nextInt();
        System.out.println("Diga sua avaliação para o filme: ");
        double resposta3 = teclado.nextDouble();

        System.out.println(resposta);
        System.out.println(resposta2);
        System.out.println(resposta3);
    }
}