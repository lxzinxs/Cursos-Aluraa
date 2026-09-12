package Exercicio_03;

public class Main {
    public static void main(String[] args) {
        //Exercicio_01
        Carro meuCarro = new Carro();
        meuCarro.definirModelo("Esportivo");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.exibirInformacao();
        System.out.println("\n");

        //Exercicio_02
        Cachorro cachorro = new Cachorro();
        cachorro.abanarRabo();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.arranharMoveis();
        gato.emitirSom();
        System.out.println("\n");

        //Exercicio 03
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100000);
        conta.sacar(1000);
        conta.consultarSaldo();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(1000);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(1000);
        contaCorrente.consultarSaldo();
        System.out.println("\n");

        //Exercicio_04
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
    }
}
