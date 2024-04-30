/*
19) Fa�a um programa que leia um n�mero inteiro entre 0 e 999 e apresente a soma dos
seus d�gitos. Por exemplo, se o n�mero digitado por 284 o resultado ser� igual a 14
(2+8+4)
 */
package lista02;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        int numero, somaDigitos;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEntre com um n�mero inteiro entre 0 e 999:\n> ");
        numero = sc.nextInt();

        somaDigitos = (numero / 100) + ((numero % 100) / 10) + ((numero % 100) % 10);
        System.out.println("\n\nA soma dos digitos " + (numero / 100) + " + " + ((numero % 100) / 10) + " + " + ((numero % 100) % 10) + " do n�mero (" + numero + ") � igual a " + somaDigitos+"!");
    }
}
