/*
4) Faça um programa que leia um número inteiro N e apresente uma mensagem
indicando se N é par ou ímpar.
 */
package lista03;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("\nEntre com o número inteiro: \n> ");
        n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("\n\nNúmero é par!");
        } else {
            System.out.println("\n\nNúmero é ímpar!");
        }

    }
}
