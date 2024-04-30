/*
7) Faça um programa que leia três valores inteiros e os imprima em ordem crescente.

 */
package lista03;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, menor, meio, maior;

        System.out.print("\nEntre com o primeiro número: \n> ");
        n1 = sc.nextInt();

        System.out.print("\nEntre com o segundo número: \n> ");
        n2 = sc.nextInt();

        System.out.print("\nEntre com o terceiro número: \n> ");
        n3 = sc.nextInt();

        if (n1 <= n2 && n1 <= n3) {
            menor = n1;

            if (n2 <= n3) {
                meio = n2;
                maior = n3;
            } else {
                meio = n3;
                maior = n2;
            }
        } else if (n2 <= n1 && n2 <= n3) {
            menor = n2;

            if (n1 <= n3) {
                meio = n1;
                maior = n3;
            } else {
                meio = n3;
                maior = n1;
            }
        } else {
            menor = n3;

            if (n1 <= n2) {
                meio = n1;
                maior = n3;
            } else {
                meio = n2;
                maior = n1;
            }
        }

        System.out.println("\n\nNúmeros Ordenados: " + menor + " " + meio + " " + maior);
    }
}
