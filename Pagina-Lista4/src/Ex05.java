/*
5) Fa�a um programa que leia um n�mero inteiro N e imprima "F1", "F2" ou "F3", conforme
a condi��o:
" "F1", se N <= 10
" "F2", se N > 10 e N <= 100
" "F3", se n > 100
 */
package lista03;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean f1, f2, f3;

        System.out.print("\nEntre com o n�mero inteiro: \n> ");
        n = sc.nextInt();

        f1 = (n <= 10);
        f2 = (n > 10 && n <= 100);
        f3 = (n > 100);

        if (f1 == true) {
            System.out.println("\n\nN�mero inteiro � menor ou igual a 10!");
        } else if (f2 == true) {
            System.out.println("\n\nN�mero inteiro � maior que 10 e menor ou igual a 100!");
        } else if (f3 == true) {
            System.out.println("\n\nN�mero inteiro � maior que 100!");
        }

    }
}

