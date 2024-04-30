package listaex01;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Escreva um programa que receba um horário (horas, minutos e segundos) e
determine quantos segundos ainda faltam para terminar o dia (considere o dia com 24
horas).
 */
public class Exercicio14 {
    
        public static void main(String[] args) {
        int h, m, s, sRestantes;
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o valor das horas:\n> ");
        h = sc.nextInt();

        System.out.print("\nEntre com o valor dos minutos:\n> ");
        m = sc.nextInt();

        System.out.print("\nEntre com o valor dos segundos:\n> ");
        s = sc.nextInt();

        sRestantes = (24 * 3600) - ((h * 3600) + (m * 60) + s);

        System.out.println("\nRestam " + sRestantes + "s para o término do dia!");
    }
}
