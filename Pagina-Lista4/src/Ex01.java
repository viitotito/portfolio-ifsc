/*
1) Crie um programa que leia o preço do quilowatt de energia e a quantidade gasta de
quilowatts em uma residência. O programa deve calcular e imprimir o valor a ser pago
pela residência caso a conta seja paga no dia e o valor a ser pago caso a conta seja paga
em atraso. Caso a conta seja paga em atraso, deve-se acrescentar 10% sobre o valor da
conta. Além disto, o programa deve mostrar uma mensagem indicando se a residência
está com consumo elevado de energia. A empresa considera consumo elevado de
energia, se a residência consumir mais de de 70 quilowatts.
O programa deve apresentar a mensagem "Consumo elevado de energia", caso o
consumo seja elevado, ou "Você é um consumidor consciente", caso o consumo não seja
elevado.
 */
package lista03;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Vitor Montunes
 */
public class Ex01 {
    
    public static void main(String[] args) {
        double preco, quilowatts, conta, contaAtrasada;
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o preço do quilowatt:\n> ");
        preco = sc.nextDouble();

        System.out.print("\nEntre com o gasto de quilowatt:\n> ");
        quilowatts = sc.nextDouble();

        conta = preco * quilowatts;

        contaAtrasada = conta + (conta * 0.1);

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("\n\nConta: " + df.format(conta));
        System.out.print("\nConta Atrasada com multa de 10%: " + df.format(contaAtrasada));

        if (quilowatts > 70) {
            System.out.println("\n\nConsumo elevado de energia.");
        } else {
            System.out.println("\n\nVocê é um consumidor consciente!");
        }

    }
}
