package listaex01;

import java.util.Scanner;

/*
Faça um programa que leia dois números, calcule e apresente o quadrado da soma
destes números.
 */
public class Exercicio04 {

    public static void main(String[] args) {
        double a, b, sq;
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o valor do primeiro número:\n> ");
        a = sc.nextDouble();

        System.out.print("\nEntre com o valor do segundo número:\n> ");
        b = sc.nextDouble();

        sq = Math.pow((a + b), 2);

        System.out.println("\nO quadrado da soma dos números 1 e 2 é igual a " + sq + "!");
    }

}
