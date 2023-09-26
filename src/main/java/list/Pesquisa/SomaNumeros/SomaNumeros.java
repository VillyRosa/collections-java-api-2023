package main.java.list.Pesquisa.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> inteirosList;

    public SomaNumeros() { this.inteirosList = new ArrayList<>(); }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "inteirosList=" + inteirosList +
                '}';
    }

    public void adicionarNumero(int numero) {
        inteirosList.add(numero);
    }
    public int calcularSoma() {
        int total = 0;
        if (!inteirosList.isEmpty()) {
            for (int n : inteirosList) {
                total+= n;
            }
        }
        return total;
    }
    public int encontrarMaiorNumero() {
        int maiorNumero = 0;
        if (!inteirosList.isEmpty()) {
            for (Integer i : inteirosList) {
                if (maiorNumero < i) {
                    maiorNumero = i;
                }
            }
        }
        return maiorNumero;
    }
    public int encontrarMenorNumero() {
        int menorNumero = 0;
        if (!inteirosList.isEmpty()) {
            menorNumero = inteirosList.get(0);
            for (Integer i : inteirosList) {
                if (menorNumero > i) {
                    menorNumero = i;
                }
            }
        }
        return menorNumero;
    }
    public void exibirNumeros() {
        System.out.println(inteirosList);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);

        System.out.println("Soma dos números: " + somaNumeros.calcularSoma());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
    }
}
