package main.java.list.OperacoesBasicas.CarrinhoCompras;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + this.nome + "; Preço: R$ " + this.preco + "; Quantidade: " + this.quantidade;
    }
}
