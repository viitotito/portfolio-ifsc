package listaex01;

import java.util.Scanner;

/*
Uma sorveteria vende tr�s tipos de picol�s. Sabendo-se que o picol� tipo 1 � vendido
por R$ 1,50, o do tipo 2 por R$ 2,00 e o do tipo 3 por R$ 0,75, fa�a um programa que leia
a quantidade vendida de cada tipo de picol� e apresente o valor arrecadado com as
vendas de cada tipo de picol� e o valor total das vendas.
 */
public class Exercicio07 {

    public static void main(String[] args) {
        int qTipo1, qTipo2, qTipo3;
        double vTipo1, vTipo2, vTipo3, vTotal;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a quantidade de picol�s vendidos do tipo 1:\n> ");
        qTipo1 = sc.nextInt();
        
        System.out.print("\nEntre com a quantidade de picol�s vendidos do tipo 2:\n> ");
        qTipo2 = sc.nextInt();
        
        System.out.print("\nEntre com a quantidade de picol�s vendidos do tipo 3:\n> ");
        qTipo3 = sc.nextInt();

        vTipo1 = qTipo1 * 1.50F;
        vTipo2 = qTipo2 * 2.00F;
        vTipo3 = qTipo3 * 0.75F;
        
        
        vTotal = vTipo1 + vTipo2 + vTipo3;
        
        System.out.println("\nValor Arrecadado individual:");
        System.out.println("Picol� tipo 1: "+vTipo1+"\nPicol� tipo 2: "+vTipo2+"\nPicol� tipo 3: "+vTipo3);
        System.out.println("\nValor total de vendas: "+vTotal);
    }
}
