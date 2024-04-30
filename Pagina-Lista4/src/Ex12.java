/*
12) Um ângulo é agudo se for menor que 90 graus, reto se for igual a 90 graus e é dito
obtuso se for maior que 90 graus. Escreva um programa que leia o valor de um ângulo e
imprima uma informação dizendo se o mesmo é agudo, reto ou obtuso. 
 */
package lista03;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angulo;

        System.out.print("\nEntre com o ângulo: \n> ");
        angulo = sc.nextInt();

        if (angulo > 0 && angulo < 90) {
            System.out.println("\n\nÂNGULO AGUDO");
        } else if (angulo == 90) {
            System.out.println("\n\nÂNGULO RETO");
        } else if (angulo > 90) {
            System.out.println("\n\nÂNGULO OBTUSO");
        } else {
            System.out.println("\n\nVALOR INVÁLIDO!");
        }
    }
}
