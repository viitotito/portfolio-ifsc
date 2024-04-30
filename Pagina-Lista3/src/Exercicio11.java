/*
11) Fa�a um programa que calcule os gastos com combust�vel em uma viagem. O
programa deve solicitar ao usu�rio a dist�ncia a ser percorrida em Km, o consumo m�dio
do carro (quantos quil�metros o carro percorre com um litro de combust�vel) em Km/litro e
o pre�o do litro do combust�vel. O programa deve calcular e apresentar o valor em R$ a
ser gasto com combust�vel na viagem.
 */
package lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        double distanciaPercorrida, consumoMedio, precoCombustivel, gastoTotal;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEntre com a dist�ncia a ser percorrida (Km): \n> ");
        distanciaPercorrida = sc.nextDouble();

        System.out.print("\nEntre com a m�dia de consumo do ve�culo (Km/L): \n> ");
        consumoMedio = sc.nextDouble();

        System.out.print("\nEntre com o pre�o do combust�vel (R$): \n>");
        precoCombustivel = sc.nextDouble();

        gastoTotal = (distanciaPercorrida / consumoMedio) * precoCombustivel;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("\n\nVoc� gastar� " + df.format(gastoTotal) + "R$ com essa viagem!");
    }
}
