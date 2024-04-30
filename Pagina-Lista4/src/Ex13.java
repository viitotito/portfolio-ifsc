/*
13) Construa um programa que leia o nome e a quantidade em estoque de três produtos
e mostre quais produtos estão abaixo do estoque mínimo (30 unidades). 
 */
package lista03;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeProd1, nomeProd2, nomeProd3, produtosAbaixo;
        produtosAbaixo = "";
        int qtdProd1, qtdProd2, qtdProd3;

        System.out.print("\nEntre com o nome do primeiro produto: \n> ");
        nomeProd1 = sc.nextLine();

        System.out.print("\nEntre com o nome do segundo produto: \n> ");
        nomeProd2 = sc.nextLine();

        System.out.print("\nEntre com o nome do terceiro produto: \n> ");
        nomeProd3 = sc.nextLine();

        System.out.print("\nEntre com a quantidade em estoque do primeiro produto: \n> ");
        qtdProd1 = sc.nextInt();

        System.out.print("\nEntre com a quantidade em estoque do segundo produto: \n> ");
        qtdProd2 = sc.nextInt();

        System.out.print("\nEntre com a quantidade em estoque do terceiro produto: \n> ");
        qtdProd3 = sc.nextInt();

        if (qtdProd1 < 30) {
            produtosAbaixo = produtosAbaixo + " / " + nomeProd1;
        }

        if (qtdProd2 < 30) {
            produtosAbaixo = produtosAbaixo + " / " + nomeProd2;
        }

        if (qtdProd3 < 30) {
            produtosAbaixo = produtosAbaixo + " / " + nomeProd3;
        }

        System.out.println("\n\nProdutos abaixo do estoque: " + produtosAbaixo);
    }
}
