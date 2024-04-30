package listaex01;

import java.util.Scanner;

/*
João recebeu seu salário de R$ 1500,00 e precisa pagar duas contas (C1=R$ 200,00
e C2=R$120,00). Como as contas estão atrasadas, João terá de pagar multa de 2% sobre
cada conta. Faça um programa que calcule e mostre quanto restará do salário do João.
 */
public class Exercicio16 {

    public static void main(String[] args) {
        double salario, c1, c2;
        salario = 1500;
        c1 = 200 + (200 * 0.02);
        c2 = 120 + (120 * 0.02);

        Scanner sc = new Scanner(System.in);

        System.out.println("Salário Inicial: " + salario);
        System.out.println("\nConta 1: " + c1 + "\nConta 2: " + c2);
        System.out.println("\nConta 1 + multa: " + c1 + "\nConta 2 + multa: " + c2);
        System.out.println("\nSalário Final: " + (salario - (c1 + c2)));

    }
}
