/*
17) Faça um programa que leia a quantidade total de parcelas de um consórcio, a
quantidade de parcelas já pagas e o valor de cada parcela (considere que todas as
parcelas tem o mesmo valor). O programa deve calcular e apresentar o total já pago pelo
cliente e qual é o seu saldo devedor.
 */
package lista02;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        int quantidadeParcelas, parcelasPagas;
        double valorParcela, totalPago, saldoDevedor;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEntre com a quantidade de parcelas: \n> ");
        quantidadeParcelas = sc.nextInt();

        System.out.print("\nEntre com a quantidade de parcelas pagas: \n> ");
        parcelasPagas = sc.nextInt();

        System.out.print("\nEntre com o valor da parcela: \n> ");
        valorParcela = sc.nextDouble();

        totalPago = parcelasPagas * valorParcela;
        saldoDevedor = totalPago - (quantidadeParcelas * valorParcela);

        System.out.println("\n\nValor total da compra: " + (valorParcela * quantidadeParcelas) + "R$");
        System.out.println("\nTotal pago: " + totalPago + "R$");
        System.out.println("\nSaldo devedor: " + saldoDevedor + "R$");
    }
}
