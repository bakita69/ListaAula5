package atividade490;
import java.util.Scanner;

public class Atividade490 {

    public static String substituir(String palavra) {
        return palavra.replace('c', '*');
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[] nome = new String[10];

        for (int l = 0; l < 10; l++) {
            System.out.print("Digite palavra em letras minusculas " + (l + 1) + ": ");
            nome[l] = ler.nextLine();
        }

        System.out.println("\nPalavras modificadas: ");
        for (int l = 0; l < 10; l++) {
            String palavraModificada = substituir(nome[l]);
            System.out.println((l + 1) + " - " + palavraModificada);
        }

        ler.close();
    }
}