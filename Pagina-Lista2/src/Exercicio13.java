package listaex01;

import java.util.Scanner;

/*
Escreva um programa que receba um horário (horas, minutos e segundos) e
determine quantos segundos já se passaram desde que o dia começou.
 */
public class Exercicio13 {

    public static void main(String[] args) {
        int h, m, s, sPassados;
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o valor das horas:\n> ");
        h = sc.nextInt();

        System.out.print("\nEntre com o valor dos minutos:\n> ");
        m = sc.nextInt();

        System.out.print("\nEntre com o valor dos segundos:\n> ");
        s = sc.nextInt();

        sPassados = (h * 3600) + (m * 60) + s;

        System.out.println("\nSe passaram " + sPassados + "s desde que o dia começou!");
    }
}
