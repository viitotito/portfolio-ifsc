/*
9) Escreva um programa que leia o valor da compra e o valor pago pelo cliente. O
programa deve calcular e apresentar, o valor da compra, o valor pago pelo cliente, o valor
do troco e a quantidade de notas que deve ser dada de cada tipo para formar este troco.
O troco deve ser dado de forma a minimizar a quantidade de notas distribuídas.
 */
package lista02;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        double valorCompra, valorPago, valorTroco;
        int notasCem, notasDez, notasUm;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEntre com o valor da compra:\n> ");
        valorCompra = sc.nextDouble();

        System.out.print("\nEntre com o valor pago:\n> ");
        valorPago = sc.nextDouble();

        valorTroco = valorPago - valorCompra;

        if (valorPago >= valorCompra) {
            notasCem = (int) valorTroco / 100;
            notasDez = (int) (valorTroco % 100) / 10;
            notasUm = (int) ((valorTroco % 100) % 10);

            System.out.println("\n\nValor da compra: " + valorCompra);
            System.out.println("\nValor pago: " + valorPago);
            System.out.println("\nValor do troco: " + valorTroco);

            System.out.println("\n\nNotas de cem: " + notasCem);
            System.out.println("\nNotas de dez: " + notasDez);
            System.out.println("\nNotas de um: " + notasUm);

        } else {
            System.out.println("\n\nPagamento insuficiente!");
        }
    }
}
