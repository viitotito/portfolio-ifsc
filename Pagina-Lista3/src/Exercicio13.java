/*
13) Faça um programa que leia os valores A, B e C e informe se a soma de A com B é
menor ou igual a C.
 */
package lista02;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        int a, b, c, soma;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEntre com o valor de A: \n> ");
        a = sc.nextInt();

        System.out.print("\nEntre com o valor de B: \n> ");
        b = sc.nextInt();

        System.out.print("\nEntre com o valor de C: \n> ");
        c = sc.nextInt();

        soma = a + b;

        if (soma > c) {
            System.out.println("\n\nSoma maior que C!");
        } else if (soma == c) {
            System.out.println("\n\nSoma igual a C!");
        } else {
            System.out.println("\n\nSoma menor que C!");
        }
    }
}
