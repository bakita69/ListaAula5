package atividade499;

import java.util.Scanner;

public class Atividade499 {
    static int[] vetor = new int[5];
    static Scanner scanner = new Scanner(System.in);
    static boolean vetorPreenchido = false;

    public static void main(String[] args) {
        int opcao;
        
        do {
            System.out.println("\nMENU VETOR - FUNCAO");
            System.out.println("1. Dados do VETOR");
            System.out.println("2. Ordena VETOR");
            System.out.println("3. Imprime VETOR");
            System.out.println("4. Sai do programa");
            System.out.print("OPCAO: ");
            
            opcao = scanner.nextInt();
            
            switch(opcao) {
                case 1:
                    dadosVetor();
                    break;
                case 2:
                    if(!vetorPreenchido) {
                        System.out.println("\nEscolha primeiro a opcao 1!");
                        break;
                    }
                    ordenaVetor();
                    break;
                case 3:
                    if(!vetorPreenchido) {
                        System.out.println("\nEscolha primeiro a opcao 1!");
                        break;
                    }
                    imprimeVetor();
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while(opcao != 4);
    }
    
    static void dadosVetor() {
        System.out.println("\nDigite os 5 elementos do vetor:");
        for(int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i+1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        vetorPreenchido = true;
        System.out.println("Vetor preenchido com sucesso!");
    }
    
    static void ordenaVetor() {
        for(int i = 0; i < 4; i++) {
            for(int j = i+1; j < 5; j++) {
                if(vetor[i] > vetor[j]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
        System.out.println("Vetor ordenado com sucesso!");
    }
    
    static void imprimeVetor() {
        System.out.println("\nElementos do vetor:");
        for(int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}