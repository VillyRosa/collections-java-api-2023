package main.java.list.OperacoesBasicas.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;
    public CarrinhoDeCompras() { this.itemList = new ArrayList<>(); }
    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    }
    public double calcularValorTotal() {
        double total = 0.0;
        for (Item i : itemList) {
            total+= i.getPreco() * i.getQuantidade();
        }
        return total;
    }
    public void exibirItens() {
        System.out.println(itemList);
    }
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Maçã", 0.75, 4);
        carrinhoDeCompras.adicionarItem("Morango", 1.20, 8);
        carrinhoDeCompras.adicionarItem("Abacaxi", 4.00, 2);

        carrinhoDeCompras.removerItem("Morango");
        carrinhoDeCompras.exibirItens();

        System.out.println("Valor total: R$ " + carrinhoDeCompras.calcularValorTotal());
    }
}
