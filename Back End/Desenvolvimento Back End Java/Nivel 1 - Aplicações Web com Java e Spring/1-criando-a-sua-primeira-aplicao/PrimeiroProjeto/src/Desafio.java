import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String divisoria = "******************************************";
        String espaco = "           ";
        String tipoConta = "Corrente";

        System.out.print("Digite o seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite o seu saldo inicial: ");
        double saldo = teclado.nextDouble();

        System.out.println("\n" + divisoria);
        System.out.println("Dados iniciais do cliente:\n");
        System.out.println("Nome:         " + espaco + nome);
        System.out.println("Tipo de conta:" + espaco + tipoConta);
        System.out.println("Saldo inicial:" + espaco + saldo);
        System.out.println(divisoria);

        boolean rodar = true;
        while (rodar) {
            System.out.println("""
                \n
                Selecione a opção que deseja:
                1 - Consultar saldos
                2 - Depositar valor
                3 - Sacar valor
                4 - Sair
                """);
            int opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é R$" + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja depositar: ");
                    double depositar = teclado.nextDouble();
                    saldo += depositar;
                    System.out.println("Saldo atualizado R$" + saldo);
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja sacar: ");
                    double sacar = teclado.nextDouble();
                    if (sacar > saldo) {
                        System.out.println("Você não possui esse dinheiro!");
                        break;
                    } else {
                        saldo -= sacar;
                        System.out.println("Saldo atualizado R$" + saldo);
                        break;
                    }
                case 4:
                    System.out.println("Você saiu do programa!");
                    rodar = false;
                    break;
                default:
                    System.out.println("Escreva uma opção válida!");
            }
        }
    }
}
