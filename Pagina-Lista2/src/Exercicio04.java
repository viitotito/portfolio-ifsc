package listaex01;

import java.util.Scanner;

/*
Fa�a um programa que leia dois n�meros, calcule e apresente o quadrado da soma
destes n�meros.
 */
public class Exercicio04 {

    public static void main(String[] args) {
        double a, b, sq;
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o valor do primeiro n�mero:\n> ");
        a = sc.nextDouble();

        System.out.print("\nEntre com o valor do segundo n�mero:\n> ");
        b = sc.nextDouble();

        sq = Math.pow((a + b), 2);

        System.out.println("\nO quadrado da soma dos n�meros 1 e 2 � igual a " + sq + "!");
    }

}
