/*
4) Fa�a um programa que leia um n�mero inteiro N e apresente uma mensagem
indicando se N � par ou �mpar.
 */
package lista03;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("\nEntre com o n�mero inteiro: \n> ");
        n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("\n\nN�mero � par!");
        } else {
            System.out.println("\n\nN�mero � �mpar!");
        }

    }
}
