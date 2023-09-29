package main.java.list.Ordenacao.OrdenacaoPessoa;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private Integer idade;
    private Double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return this.nome;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public Double getAltura() {
        return this.altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return this.idade.compareTo(pessoa.idade);
    }
}
class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa primeiraPessoa, Pessoa segundaPessoa) {
        return primeiraPessoa.getAltura().compareTo(segundaPessoa.getAltura());
    }
}