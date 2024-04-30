package listaex01;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Um restaurante a quilo cobra R$39,00 por quilo de refeição. Escreva um programa
que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Obs.
O prato vazio pesa 450 gramas.
 */
public class Exercicio12 {

    public static void main(String[] args) {
        double pesoPrato;
        int valorPagamento;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Entre com o valor do peso do prato (Kg):\n> ");
        pesoPrato = sc.nextDouble();

        valorPagamento = (int) (pesoPrato - 0.45) * 39;

        System.out.println("\nPeso do prato montado: " + pesoPrato + "Kg");
        System.out.println("Peso do prato vazio: 450g");

        System.out.println("Peso final do prato: " + df.format(pesoPrato - 0.45));

        System.out.println("\nTotal a pagar: " + valorPagamento + "R$");
    }
}
