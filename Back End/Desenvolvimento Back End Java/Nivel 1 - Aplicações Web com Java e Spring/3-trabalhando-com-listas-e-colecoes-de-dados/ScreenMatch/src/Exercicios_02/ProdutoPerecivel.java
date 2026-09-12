package Exercicios_02;

public class ProdutoPerecivel extends Produto{
    int dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, int dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }
}
