package main.java.list.Ordenacao.OrdenacaoPessoa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private final List<Pessoa> pessoaList = new ArrayList<>();
    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> listaPorIdade = new ArrayList<>(this.pessoaList);
        Collections.sort(listaPorIdade);
        return listaPorIdade;
    }
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> listaPorAltura = new ArrayList<>(this.pessoaList);
        listaPorAltura.sort(new ComparatorPorAltura());
        return listaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 26, 1.40);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 30, 1.90);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 45, 1.56);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}