package atividade500;

import java.util.Scanner;

public class Atividade500 {
    static int[] vetorA = new int[5];
    static int[] vetorB = new int[5];
    static boolean vetorAPreenchido = false;
    static boolean vetorBPreenchido = false;
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        
        do {
            System.out.println("\nVETORES");
            System.out.println("1. Dados do VETOR A");
            System.out.println("2. Dados do VETOR B");
            System.out.println("3. Imprime VETORES");
            System.out.println("4. Soma VETORES");
            System.out.println("5. Subtrai VETORES");
            System.out.println("6. Sai do programa");
            System.out.print("OPCAO: ");
            
            opcao = ler.nextInt();
            
            switch(opcao) {
                case 1:
                    vetorA = entrada(vetorA, 5, "A");
                    vetorAPreenchido = true;
                    break;
                case 2:
                    vetorB = entrada(vetorB, 5, "B");
                    vetorBPreenchido = true;
                    break;
                case 3:
                    if(!vetorAPreenchido || !vetorBPreenchido) {
                        System.out.println("\nEscolha primeiro opcoes 1 e 2");
                        break;
                    }
                    imprime(vetorA, 5, "A");
                    imprime(vetorB, 5, "B");
                    break;
                case 4:
                    if(!vetorAPreenchido || !vetorBPreenchido) {
                        System.out.println("\nEscolha primeiro opcoes 1 e 2");
                        break;
                    }
                    soma(vetorA, vetorB, 5);
                    break;
                case 5:
                    if(!vetorAPreenchido || !vetorBPreenchido) {
                        System.out.println("\nEscolha primeiro opcoes 1 e 2");
                        break;
                    }
                    subtrai(vetorA, vetorB, 5);
                    break;
                case 6:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while(opcao != 6);
    }
    
    // Função equivalente ao pseudocódigo entrada()
    static int[] entrada(int vet[], int t, String c) {
        System.out.println("\nEntrada do VETOR " + c);
        for(int L = 0; L < t; L++) {
            System.out.print("Digite numero " + (L+1) + ": ");
            vet[L] = ler.nextInt();
        }
        return vet;
    }
    
    // Função equivalente ao pseudocódigo imprime()
    static void imprime(int vet[], int t, String c) {
        System.out.println("\nVETOR " + c);
        for(int L = 0; L < t; L++) {
            System.out.println((L+1) + " - " + vet[L]);
        }
    }
    
    // Função equivalente ao pseudocódigo soma()
    static void soma(int vet[], int vet1[], int t) {
        System.out.println("\nSOMA");
        for(int L = 0; L < t; L++) {
            int s = vet[L] + vet1[L];
            System.out.println(s);
        }
    }
    
    // Função equivalente ao pseudocódigo subtrai()
    static void subtrai(int vet[], int vet1[], int t) {
        System.out.println("\nDIFERENCA");
        for(int L = 0; L < t; L++) {
            int d = vet[L] - vet1[L];
            System.out.println(d);
        }
    }
}