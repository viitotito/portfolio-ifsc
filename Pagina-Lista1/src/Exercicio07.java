package aula08;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double numero1, numero2, numero3, numero4, resultado;

        System.out.print("Entre com o primeiro n�mero: ");
        numero1 = sc.nextFloat();

        System.out.print("Entre com o segundo n�mero: ");
        numero2 = sc.nextFloat();

        System.out.print("Entre com o terceiro n�mero: ");
        numero3 = sc.nextFloat();

        System.out.print("Entre com o quarto n�mero: ");
        numero4 = sc.nextFloat();

        resultado = Math.pow(numero1, 2) + Math.pow(numero2, 2) + Math.pow(numero3, 2) + Math.pow(numero4, 2);

        System.out.println("\nO resultado �: " + resultado);
    }

}
