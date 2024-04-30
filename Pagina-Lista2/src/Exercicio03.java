package listaex01;

import java.util.Scanner;

/* 
Faça um programa que leia dois números, calcule e apresente a soma dos quadrados
destes números.
 */
public class Exercicio03 {

    public static void main(String[] args) {
        double a, b, sq;
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o valor do primeiro número:\n> ");
        a = sc.nextDouble();

        System.out.print("\nEntre com o valor do segundo número:\n> ");
        b = sc.nextDouble();

        sq = Math.pow(a, 2) + Math.pow(b, 2);

        System.out.println("\nA soma dos quadrados dos números 1 e 2 é igual a " + sq + "!");
    }
}
