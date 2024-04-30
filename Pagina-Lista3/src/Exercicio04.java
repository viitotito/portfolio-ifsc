/*
4) Fa�a um programa que leia o peso de uma pessoa (Kg) e sua altura (Metros), calcule e
imprima o seu �ndice de massa corporal, usando a seguinte f�rmula: IMC = Peso / Altura2
.
Al�m do IMC, o programa deve mostrar se a pessoa est� acima do peso ideal (IMC > 25).
 */
package lista02;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        double peso, altura, imc;
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o peso:\n> ");
        peso = sc.nextDouble();

        System.out.print("\nEntre com a altura:\n> ");
        altura = sc.nextDouble();

        imc = peso / Math.pow(altura, 2);

        if (imc > 25) {
            System.out.println("\n\nVoc� est� acima do peso ideal!");
        } else {
            System.out.println("\n\nVoc� est� no peso ideal.");
        }
    }
}
