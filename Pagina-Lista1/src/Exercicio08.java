package aula08;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero, raizNumero;

        System.out.print("Entre com um n�mero: ");
        numero = sc.nextFloat();

        raizNumero = Math.sqrt(numero);
        System.out.println("\nA ra�z quadrada do n�mero " + numero + " � " + raizNumero + "!");

    }

}
