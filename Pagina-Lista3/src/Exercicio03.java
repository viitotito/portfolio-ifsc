/*
3) Crie uma nova vers�o do programa da quest�o 2 para que ele mostre uma mensagem
indicando se a resid�ncia est� com consumo elevado de energia. A empresa considera
consumo elevado de energia, se a resid�ncia consumir mais de de 70 quilowatts.
 */
package lista02;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        double preco, quilowatts, conta, contaAtrasada;
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o pre�o do quilowatt de energia:\n> ");
        preco = sc.nextDouble();

        System.out.print("\nEntre com a quantidade gasta de quilowatt de energia:\n> ");
        quilowatts = sc.nextDouble();

        conta = preco * quilowatts;
        contaAtrasada = conta + (conta * 0.1);

        System.out.println("\n\nPre�o da conta: " + conta);
        System.out.println("\n\nPre�o da conta atrasada com multa de 10%: " + contaAtrasada);
        
        if(quilowatts > 70){
            System.out.println("\n\nConsumo elevado de energia!");
        }
        else{
            System.out.println("\n\nConsumo normal de energia.");
        }
    }
}
