/*
2) Crie um programa que leia o pre�o do quilowatt de energia e a quantidade gasta de
quilowatts em uma resid�ncia. O programa deve calcular e imprimir o valor a ser pago
pela resid�ncia caso a conta seja paga no dia e o valor a ser pago caso a conta seja paga
em atraso. Caso a conta seja paga em atraso, deve-se acrescentar 10% sobre o valor da
conta. O programa n�o deve perguntar se a conta ser� paga em atraso ou n�o, ele deve
sempre calcular e apresentar os dois valores, para que o usu�rio analise a diferen�a e
decida se vai pagar a conta em dia ou n�o.
 */
package lista02;

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args){
        double preco, quilowatts, conta, contaAtrasada;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entre com o pre�o do quilowatt de energia:\n> ");
        preco = sc.nextDouble();
        
        System.out.print("\nEntre com a quantidade gasta de quilowatt de energia:\n> ");
        quilowatts = sc.nextDouble();
        
        conta = preco * quilowatts;
        contaAtrasada = conta + (conta * 0.1);
        
        System.out.println("\n\nPre�o da conta: "+conta);
        System.out.println("\n\nPre�o da conta atrasada com multa de 10%: "+contaAtrasada);
    }
}
