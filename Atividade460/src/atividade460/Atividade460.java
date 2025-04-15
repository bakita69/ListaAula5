
package atividade460;

import java.util.Scanner;


public class Atividade460 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero1, numero2, numero3;

        System.out.println("Digite o primeiro numero:");
        numero1 = ler.nextInt();

        System.out.println("Digite o segundo numero:");
        numero2 = ler.nextInt();

        System.out.println("Digite o terceiro numero:");
        numero3 = ler.nextInt();

        System.out.println("Dobro do primeiro numero: " + calcularDuplo(numero1));
        System.out.println("Dobro do segundo numero: " + calcularDuplo(numero2));
        System.out.println("Dobro do terceiro numero: " + calcularDuplo(numero3));

        ler.close();
    }

    public static int calcularDuplo(int numero) {
        return numero * 2;
    }
}
