/*
9) Faça um programa que, para uma conta bancária, leia o seu número, o saldo atual,
o tipo de operação a ser realizada (1 - depósito ou 2 - saque) e o valor da operação.
Após, o programa deve calcular e apresentar o novo saldo. Se o novo saldo ficar
negativo, deve ser mostrada, também, a mensagem ?conta estourada?
 */
package lista03;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numero, mensagem;
        mensagem = "";
        double saldoAtual, valor, novoSaldo;
        int operacao;

        System.out.print("\nEntre com o seu numero da conta (000-0): \n> ");
        numero = sc.nextLine();

        System.out.print("\nEntre com o seu saldo atual: \n> ");
        saldoAtual = sc.nextDouble();

        System.out.print("\nEntre com o tipo de operação a ser realizada:\n1 - Depósito\n2 - Saque\n\n> ");
        operacao = sc.nextInt();

        System.out.print("\nEntre com o valor da operação: \n> ");
        valor = sc.nextDouble();

        if (operacao == 1) {
            novoSaldo = saldoAtual + valor;

            System.out.println("\n\n=========DEPÓSITO========");
            System.out.println("\n\nSaldo anterior: " + saldoAtual);
            System.out.println("\nValor da operação: " + valor);
            System.out.println("\nNovo Saldo: " + novoSaldo);
        } else if (operacao == 2) {
            novoSaldo = saldoAtual - valor;
            mensagem = novoSaldo < 0 ? "Conta estourada!" : "";

            System.out.println("\n\n=========SAQUE========");
            System.out.println("\n\nSaldo anterior: " + saldoAtual);
            System.out.println("\nValor da operação: " + valor);
            System.out.println("\nNovo Saldo: " + novoSaldo);

            System.out.println("\n\n" + mensagem);
        } else {
            System.out.println("\n\nOperação inválida.");
        }
    }
}
