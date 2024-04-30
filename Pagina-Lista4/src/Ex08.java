/*
8) Uma empresa dará um aumento de salário aos seus funcionários de acordo com a
categoria de cada empregado. O aumento seguirá a seguinte regra:
" Funcionários das categorias A e H ganharão 10% de aumento sobre o salário;
" Funcionários das categorias B, D, e E ganharão 15% de aumento sobre o salário;
" Funcionários das categorias C e F ganharão 25% de aumento sobre o salário;
" Funcionários das demais categorias ganharão 30% de aumento sobre o salário.
Faça um programa que leia o nome do funcionários, sua categoria e salário atual e
imprima o seu nome, categoria e salário reajustado.
 */
package lista03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        String nome;
        char categoria;
        double salarioAtual, salarioNovo;

        System.out.print("\nEntre com o seu nome: \n> ");
        nome = sc.nextLine();

        System.out.print("\nEntre com a sua categoria: \n> ");
        categoria = sc.next().toUpperCase().charAt(0);

        System.out.print("\nEntre com o seu salário: \n> ");
        salarioAtual = sc.nextDouble();

        if (categoria == 'A' || categoria == 'H') {
            salarioNovo = salarioAtual + (salarioAtual * 0.1);
        } else if (categoria == 'B' || categoria == 'D' || categoria == 'E') {
            salarioNovo = salarioAtual + (salarioAtual * 0.15);
        } else if (categoria == 'C' || categoria == 'F') {
            salarioNovo = salarioAtual + (salarioAtual * 0.25);
        } else {
            salarioNovo = salarioAtual + (salarioAtual * 0.3);
        }

        System.out.println("\n\nNome: " + nome);
        System.out.println("\nCategoria: " + categoria);
        System.out.println("\nSalário Atual: " + df.format(salarioAtual));
        System.out.println("\nSalário Reajustado: " + df.format(salarioNovo));
    }
}
