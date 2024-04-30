/*
18) Um banco concederá um crédito especial aos seus clientes de acordo com o saldo
médio no último ano. Faça um programa que leia o saldo médio de um cliente e calcule o
valor do crédito de acordo com a tabela a seguir e imprima uma mensagem informando o
saldo médio e o valor do crédito.


 */
package lista03;

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldoMedio, saldoCredito;
        saldoCredito = 0;

        System.out.print("\nEntre com o valor do saldo médio anual: \n> ");
        saldoMedio = sc.nextDouble();

        if (saldoMedio >= 0 && saldoMedio <= 500) {
            saldoCredito = saldoMedio;
        } else if (saldoMedio >= 500.1 && saldoMedio <= 1000) {
            saldoCredito = saldoMedio * 0.3;
        } else if (saldoMedio >= 1000.1 && saldoMedio <= 3000) {
            saldoCredito = saldoMedio * 0.4;
        } else if (saldoMedio > 3000) {
            saldoCredito = saldoMedio * 0.5;
        }

        System.out.println("\n\nSaldo Médio: " + saldoMedio);
        System.out.println("\nValor do Crédito: " + saldoCredito);

        System.out.println("\nSaldo com Crédito: " + (saldoMedio + saldoCredito));

    }
}
