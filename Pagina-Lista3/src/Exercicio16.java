/*
 16) Fa�a um programa que leia o pre�o de tr�s mercadorias no dia 01/01/2022 e o no dia
01/02/2022. Em seguida o programa deve calcular a infla��o do per�odo, considerando a
varia��o de pre�o dos tr�s produtos. Mostre uma mensagem se a infla��o est� acima da
meta ou n�o (considere que a meta para o m�s � de 0,55%).
 */
package lista02;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        double mercadoria1_1, mercadoria2_1, mercadoria3_1, mercadoria1_2, mercadoria2_2, mercadoria3_2, inflacao_mercadoria1, inflacao_mercadoria2, inflacao_mercadoria3, media_inflacoes;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n(01/01/2022) Entre com o valor da primeira mercadoria: \n> ");
        mercadoria1_1 = sc.nextDouble();

        System.out.print("\n(01/01/2022) Entre com o valor da segunda mercadoria: \n> ");
        mercadoria2_1 = sc.nextDouble();

        System.out.print("\n(01/01/2022) Entre com o valor da terceira mercadoria: \n> ");
        mercadoria3_1 = sc.nextDouble();

        System.out.print("\n(01/02/2022) Entre com o valor da primeira mercadoria: \n> ");
        mercadoria1_2 = sc.nextDouble();

        System.out.print("\n(01/02/2022) Entre com o valor da segunda mercadoria: \n> ");
        mercadoria2_2 = sc.nextDouble();

        System.out.print("\n(01/02/2022) Entre com o valor da terceira mercadoria: \n> ");
        mercadoria3_2 = sc.nextDouble();

        inflacao_mercadoria1 = ((mercadoria1_2 - mercadoria1_1) / mercadoria1_1) * 100;
        inflacao_mercadoria2 = ((mercadoria2_2 - mercadoria2_1) / mercadoria2_1) * 100;
        inflacao_mercadoria3 = ((mercadoria3_2 - mercadoria3_1) / mercadoria3_1) * 100;

        media_inflacoes = (inflacao_mercadoria1 + inflacao_mercadoria2 + inflacao_mercadoria3) / 3;

        if (media_inflacoes > 0.55) {
            System.out.println("\n\nInfla��o do per�odo acima da m�dia.");
        } else {
            System.out.println("\n\nInfla��o do per�odo abaixo ou igual a m�dia.");
        }
    }
}
