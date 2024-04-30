/*
11) Elabore um programa que tome como entrada um determinado horário, expresso por
hora (valor inteiro de 0 a 23), minuto (valor de 0 a 59) e segundo (valor de 0 a 59) e
imprima esse horário acrescido de 1 segundo. Cada hora tem 60 minutos e cada minuto
sem 60 segundos. O incremento de um segundo no horário, além de alterar o valor do
segundo, pode implicar em alterações no valor do minuto e da hora. Veja que um horário
como 13:59:59 acrescido de 1 segundo vai para 14:00:00.

 */
package lista03;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horas, minutos, segundos;

        System.out.print("\n\nEntre com as horas (0 a 23): \n> ");
        horas = sc.nextInt();

        System.out.print("\nEntre com os minutos (0 a 59): \n> ");
        minutos = sc.nextInt();

        System.out.print("\nEntre com os segundos (0 a 59): \n> ");
        segundos = sc.nextInt();

        if (horas == 23) {
            horas = 00;
        } else {
            horas++;
        }

        if (minutos == 59) {
            minutos = 00;
        } else {
            minutos++;
        }

        if (segundos == 59) {
            segundos = 00;
        } else {
            segundos++;
        }

        System.out.println("\n\nHorário: " + String.format("%02d:%02d:%02d", horas, minutos, segundos));

    }
}
