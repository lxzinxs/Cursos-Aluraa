import java.util.Scanner;

public class OutroLoop {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga a sua avaliação para o filme ou -1 para encerrar");
            nota = teclado.nextDouble();
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }
        System.out.println("Média de avaliações " + mediaAvaliacao / totalDeNotas) ;
    }

}
