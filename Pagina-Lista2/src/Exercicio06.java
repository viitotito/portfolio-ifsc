package listaex01;

import java.util.Scanner;

/*
Escreva um programa que leia a temperatura em graus Celsius e apresente a
temperatura correspondente em graus Fahrenheit, usando a fórmula abaixo.
f = (celsius * 9 / 5) + 32;
 */
public class Exercicio06 {

    public static void main(String[] args) {
        double c, f;
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a temperatura em celsius (Cº):\n> ");
        c = sc.nextDouble();

        f = (c * 9 / 5) + 32;
        System.out.println("\nCelsius: " + c + "\nFahrenheit: " + f);
    }
}
