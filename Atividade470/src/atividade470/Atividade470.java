
package atividade470;
import java.util.Scanner;

public class Atividade470 {

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;

        System.out.println("Digite um numero > 0:");
        num = ler.nextInt();

        if (ehPrimo(num)) {
            System.out.println(num + " e primo.");
        } else {
            System.out.println(num + " nao e primo.");
        }

        ler.close();
    }
}
