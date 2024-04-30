/*
11) Faça um programa que calcule os gastos com combustível em uma viagem. O
programa deve solicitar ao usuário a distância a ser percorrida em Km, o consumo médio
do carro (quantos quilômetros o carro percorre com um litro de combustível) em Km/litro e
o preço do litro do combustível. O programa deve calcular e apresentar o valor em R$ a
ser gasto com combustível na viagem.
 */
package lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        double distanciaPercorrida, consumoMedio, precoCombustivel, gastoTotal;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEntre com a distância a ser percorrida (Km): \n> ");
        distanciaPercorrida = sc.nextDouble();

        System.out.print("\nEntre com a média de consumo do veículo (Km/L): \n> ");
        consumoMedio = sc.nextDouble();

        System.out.print("\nEntre com o preço do combustível (R$): \n>");
        precoCombustivel = sc.nextDouble();

        gastoTotal = (distanciaPercorrida / consumoMedio) * precoCombustivel;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("\n\nVocê gastará " + df.format(gastoTotal) + "R$ com essa viagem!");
    }
}
