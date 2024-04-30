/*
06) Faça um algoritmo que leia 3 números inteiros distintos e escreva o menor deles
 */
package lista03;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3;

        System.out.print("\nEntre com o primeiro número: \n> ");
        n1 = sc.nextInt();

        System.out.print("\nEntre com o primeiro número: \n> ");
        n2 = sc.nextInt();

        System.out.print("\nEntre com o primeiro número: \n> ");
        n3 = sc.nextInt();

        if (n1 < n2 && n1 < n3) {
            System.out.println("\n\n" + n1 + " é o menor número! (n1)");
        } else if (n2 < n1 && n2 < n3) {
            System.out.println("\n\n" + n2 + " é o menor número! (n2)");
        } else if (n3 < n1 && n3 < n2) {
            System.out.println("\n\n" + n3 + " é o menor número! (n3)");
        }
    }
}
