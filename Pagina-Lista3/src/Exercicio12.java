/*
12) Faça um programa que leia dois números A e B e mostre se eles são iguais.
 */
package lista02;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEntre com o valor de A: \n> ");
        a = sc.nextInt();

        System.out.print("\nEntre com o valor de B: \n> ");
        b = sc.nextInt();

        if (a == b) {
            System.out.println("\n\nNúmeros iguais!");
        } else {
            System.out.println("\n\nNúmeros diferentes!");
        }

    }
}
