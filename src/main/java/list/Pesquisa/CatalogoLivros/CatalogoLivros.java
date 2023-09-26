package main.java.list.Pesquisa.CatalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // atributo
    private List<Livro> livroList;

    public CatalogoLivros() { this.livroList = new ArrayList<>(); }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro maneiro", "Villy Rosa", 2021);
        catalogoLivros.adicionarLivro("Por que eu não sou forte como o Villy", "Yago Aguiar", 2010);
        catalogoLivros.adicionarLivro("Como lidar com a inveja que sinto", "Gustavo Scardovelli", 2015);
        catalogoLivros.adicionarLivro("Por que não aprendo uma linguagem que presta?", "Henrique Ramos", 2018);
        catalogoLivros.adicionarLivro("Casadas, pegar ou não pegar?", "Gustavo Costa", 2023);

        System.out.println(catalogoLivros.pesquisarPorAutor("Villy Rosa"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2016, 2022));
        System.out.println(catalogoLivros.pesquisaPorTitulo("Livro maneiro"));
    }

}
