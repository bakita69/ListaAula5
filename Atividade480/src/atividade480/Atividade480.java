package atividade480;

import java.util.Scanner;

public class Atividade480 {

    public static boolean eCapicua(int numero) {
        String original = Integer.toString(numero);
        String invertido = new StringBuilder(original).reverse().toString();
        return original.equals(invertido);
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero para verificar se e capicua:");
        int numero = ler.nextInt();

        if (eCapicua(numero)) {
            System.out.println("O numero " + numero + " e capicua.");
        } else {
            System.out.println("O numero " + numero + " nao e capicua.");
        }

        ler.close();
    }
}
