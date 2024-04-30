/*
9) Fa�a um programa que, para uma conta banc�ria, leia o seu n�mero, o saldo atual,
o tipo de opera��o a ser realizada (1 - dep�sito ou 2 - saque) e o valor da opera��o.
Ap�s, o programa deve calcular e apresentar o novo saldo. Se o novo saldo ficar
negativo, deve ser mostrada, tamb�m, a mensagem ?conta estourada?
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

        System.out.print("\nEntre com o tipo de opera��o a ser realizada:\n1 - Dep�sito\n2 - Saque\n\n> ");
        operacao = sc.nextInt();

        System.out.print("\nEntre com o valor da opera��o: \n> ");
        valor = sc.nextDouble();

        if (operacao == 1) {
            novoSaldo = saldoAtual + valor;

            System.out.println("\n\n=========DEP�SITO========");
            System.out.println("\n\nSaldo anterior: " + saldoAtual);
            System.out.println("\nValor da opera��o: " + valor);
            System.out.println("\nNovo Saldo: " + novoSaldo);
        } else if (operacao == 2) {
            novoSaldo = saldoAtual - valor;
            mensagem = novoSaldo < 0 ? "Conta estourada!" : "";

            System.out.println("\n\n=========SAQUE========");
            System.out.println("\n\nSaldo anterior: " + saldoAtual);
            System.out.println("\nValor da opera��o: " + valor);
            System.out.println("\nNovo Saldo: " + novoSaldo);

            System.out.println("\n\n" + mensagem);
        } else {
            System.out.println("\n\nOpera��o inv�lida.");
        }
    }
}
