package aula08;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero, quadradoNumero;

        System.out.print("Entre com um número: ");
        numero = sc.nextFloat();

        quadradoNumero = Math.pow(numero, 2);

        System.out.println("\nO quadrado do número é: " + quadradoNumero);
    }

}
