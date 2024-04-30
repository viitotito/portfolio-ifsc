package listaex01;

import java.util.Scanner;

/*
Uma pessoa foi ao supermercado e comprou:
Q quilos de café, cujo custo unitário é X;
L litros de leite, cujo custo unitário é Y;
B pacotes de bolacha, cujo custo unitário é Z.

Faça um programa que leia estes dados e imprima, para cada produto: nome do produto,
total gasto com ele. Além disto, ele deve apresentar o total gasto na compra.
 */
public class Exercicio09 {

    public static void main(String[] args) {
        double qCafe, cCafe, lLeite, cLeite, bBolacha, cBolacha, gCafe, gLeite, gBolacha, gTotal;
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a quantidade comprada em quilos de café (Q):\n> ");
        qCafe = sc.nextDouble();

        System.out.print("\nEntre com o valor do quilo de café:\n> ");
        cCafe = sc.nextDouble();

        System.out.print("\nEntre com a quantidade comprada em litros de leite (L):\n> ");
        lLeite = sc.nextDouble();

        System.out.print("\nEntre com o valor do litro de leite:\n> ");
        cLeite = sc.nextDouble();

        System.out.print("\nEntre com a quantidade comprada de bolachas (Qtd):\n> ");
        bBolacha = sc.nextDouble();

        System.out.print("\nEntre com o valor da bolacha:\n> ");
        cBolacha = sc.nextDouble();
        
        gCafe = qCafe * cCafe;
        gLeite = lLeite * cLeite;
        gBolacha = bBolacha * cBolacha;
        
        gTotal = gCafe + gLeite + gBolacha;
        
        System.out.println("\nCafé: "+gCafe+"R$");
        System.out.println("Leite: "+gLeite+"R$");
        System.out.println("Bolacha: "+gBolacha+"R$");
        
        System.out.println("\nTotal Gasto: "+gTotal+"R$");

    }
}
