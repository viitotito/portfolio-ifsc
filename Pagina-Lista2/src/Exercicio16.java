package listaex01;

import java.util.Scanner;

/*
Jo�o recebeu seu sal�rio de R$ 1500,00 e precisa pagar duas contas (C1=R$ 200,00
e C2=R$120,00). Como as contas est�o atrasadas, Jo�o ter� de pagar multa de 2% sobre
cada conta. Fa�a um programa que calcule e mostre quanto restar� do sal�rio do Jo�o.
 */
public class Exercicio16 {

    public static void main(String[] args) {
        double salario, c1, c2;
        salario = 1500;
        c1 = 200 + (200 * 0.02);
        c2 = 120 + (120 * 0.02);

        Scanner sc = new Scanner(System.in);

        System.out.println("Sal�rio Inicial: " + salario);
        System.out.println("\nConta 1: " + c1 + "\nConta 2: " + c2);
        System.out.println("\nConta 1 + multa: " + c1 + "\nConta 2 + multa: " + c2);
        System.out.println("\nSal�rio Final: " + (salario - (c1 + c2)));

    }
}
