
package atividade497;

import java.util.Scanner;

public class Atividade497 {

    public static void ordena(int[] vet, int tam) {
        for (int l = 0; l < tam - 1; l++) {
            for (int c = l + 1; c < tam; c++) {
                if (vet[l] > vet[c]) {
                    int aux = vet[l];
                    vet[l] = vet[c];
                    vet[c] = aux;
                }
            }
        }
    }

    public static int busca(int[] vet, int tam, int chave) {
        int ini = 0;
        int fim = tam - 1;

        while (ini <= fim) {
            int meio = (ini + fim) / 2;

            if (vet[meio] == chave) {
                return meio;
            } else if (chave < vet[meio]) {
                fim = meio - 1;
            } else {
                ini = meio + 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] num = new int[10];
        int tam = 10;

        for (int i = 0; i < tam; i++) {
            System.out.println("Digite o numero " + (i + 1) + ":");
            num[i] = ler.nextInt();
        }

        System.out.println("Digite o numero de busca:");
        int chave = ler.nextInt();

        ordena(num, tam);

        System.out.println("\nVETOR ORDENADO");
        for (int i = 0; i < tam; i++) {
            System.out.println((i + 1) + " - " + num[i]);
        }

        int posicao = busca(num, tam, chave);

        if (posicao >= 0) {
            System.out.println("\nPosicao no vetor: " + (posicao + 1));
        } else {
            System.out.println("\nNAO ENCONTRADO");
        }

        ler.close();
    }
}
