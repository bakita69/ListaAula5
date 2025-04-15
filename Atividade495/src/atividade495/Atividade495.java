
package atividade495;

import java.util.Scanner;

public class Atividade495 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome " + (i + 1) + ":");
            nomes[i] = ler.nextLine();
        }

        ordena(nomes, 5);

        System.out.println("\nNOMES ORDENADOS:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " - " + nomes[i]);
        }

        ler.close();
    }

    public static void ordena(String[] vet, int tam) {
        for (int l = 0; l < tam - 1; l++) {
            for (int c = l + 1; c < tam; c++) {
                if (vet[l].compareTo(vet[c]) > 0) {
                    String aux = vet[l];
                    vet[l] = vet[c];
                    vet[c] = aux;
                }
            }
        }
    }
}
