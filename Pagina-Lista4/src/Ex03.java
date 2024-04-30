/*
3) Faça um programa que leia o peso de uma pessoa (Kg) e sua altura (Metros), calcule e
imprima o seu índice de massa corporal, usando a seguinte fórmula: IMC = Peso / Altura2
.
Além do IMC, o programa deve mostrar a situação da pessoa, de acordo com o seu IMC:
" Abaixo de 20 " magro;
" Entre 20 e 24,99 " normal;
" Entre 25 e 30 " sobrepeso;
" Acima de 30 " obeso.
 */
package lista03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double peso, altura, imc;

        System.out.print("\nEntre com o seu peso:\n> ");
        peso = sc.nextDouble();

        System.out.print("\nEntre com a sua altura:\n> ");
        altura = sc.nextDouble();

        imc = peso / Math.pow(altura, 2);

        System.out.println("\n\nSeu IMC é: " + df.format(imc));

        if (imc <= 20) {
            System.out.println("\n\nMagro.");
        }

        if (imc > 20 && imc <= 24.99) {
            System.out.println("\n\nNormal.");
        }

        if (imc >= 25 && imc <= 30) {
            System.out.println("\n\nSobrepeso");
        }
        if (imc > 30) {
            System.out.println("\n\nObeso.");
        }

    }
}
