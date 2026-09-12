package Exercicio_02;

public class Principal {
    public static void main(String[] args) {
        //Exercicio 01
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(10);
        conta.setSaldo(2500);
        conta.titular = "Lucas Nery";

        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Número do saldo: " + conta.getSaldo());
        System.out.println("Nome do titular: " + conta.titular);

        conta.setSaldo(100000);
        System.out.println("Novo saldo: " + conta.getSaldo());
        System.out.println("\n");

        //Exercicio 02
        IdadePessoa pessoa = new IdadePessoa();

        pessoa.setNome("Lucas Nery");
        pessoa.setIdade(19);
        System.out.println("O nome da pessoa: " + pessoa.getNome());
        System.out.println("Idade da pessoa: " + pessoa.getIdade());
        pessoa.verificarIdade();

        pessoa.setNome("Vitoria Faria");
        pessoa.setIdade(17);
        System.out.println("O nome da pessoa: " + pessoa.getNome());
        System.out.println("A idade da pessoa: " + pessoa.getIdade());
        pessoa.verificarIdade();
        System.out.println("\n");

        //Exercicio 03
        Produto produto1 = new Produto();

        produto1.setNome("Chocolate");
        produto1.setPreco(8.99);
        System.out.println("O produto: " + produto1.getNome());
        System.out.println("O preço: " + produto1.getPreco());

        Produto produto2 = new Produto();

        produto2.setNome("Chocolate");
        produto2.setPreco(8.99);
        System.out.println("O produto: " + produto2.getNome());
        System.out.println("O preço: " + produto2.getPreco());
        produto2.aplicarDesconto(10);
        System.out.println("Preço com desconto: " + produto2.getPreco());
        System.out.println("\n");

        //Exercicio 04
        Aluno aluno1 = new Aluno();

        aluno1.setNome("Lucas Nery");
        aluno1.setNotas1(10);
        aluno1.setNotas2(9);
        aluno1.setNotas3(10);
        System.out.println("O aluno: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNotas1() + "\nNota 2: " + aluno1.getNotas2() + "\nNota 3: " + aluno1.getNotas3());
        System.out.println("Sua média: " + aluno1.calcularMedia());

        Aluno aluno2 = new Aluno();

        aluno2.setNome("Vitoria");
        aluno2.setNotas1(8);
        aluno2.setNotas2(7);
        aluno2.setNotas3(9);
        System.out.println("O aluno: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNotas1() + "\nNota 2: " + aluno2.getNotas2() + "\nNota 3: " + aluno2.getNotas3());
        System.out.println("Sua média: " + aluno2.calcularMedia());
        System.out.println("\n");

        //Exercicio 05
        Livro livro1 = new Livro();

        livro1.setAutor("Andrew Hunt e David Thomas");
        livro1.setTitulo("O Programador Pragmático");
        livro1.exibirDetalhes();

        Livro livro2 = new Livro();

        livro2.setTitulo("Código Limpo");
        livro2.setAutor("Robert C. Martin");
        livro2.exibirDetalhes();
    }
}
