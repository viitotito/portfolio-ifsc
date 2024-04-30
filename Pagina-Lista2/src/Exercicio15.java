package listaex01;

import java.util.Scanner;

/*
Faça um programa que receba o peso de uma pessoa, calcule e apresente:
a) o novo peso se a pessoa engordar 15% sobre o peso digitado;
b) o novo peso se a pessoa emagrecer 20% sobre o peso digitado.
 */
public class Exercicio15 {
    public static void main(String[] args) {
        double peso;
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o peso em quilogramas (Kg):\n> ");
        peso = sc.nextDouble();

        System.out.println("\nPeso atual: " + peso);
        System.out.println("Peso se engordar 15%: " + (peso + (peso * 0.15)));       
        System.out.println("Peso se emagrecer 20%: " + (peso - (peso * 0.20)));
    }
}
