/*
16) Escreva um programa que tome como entradas as coordenadas de um ponto
(abscissa e ordenada) e imprima em que quadrante (1, 2, 3 ou 4) o ponto está localizado.
 */
package lista03;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        String quadrante;

        System.out.print("\nEntre com o valor de X: \n> ");
        x = sc.nextInt();

        System.out.print("\nEntre com o valor de Y: \n> ");
        y = sc.nextInt();

        if (x > 0 && y > 0) {
            quadrante = "1º Quadrante";
        } else if (x < 0 && y > 0) {
            quadrante = "2º Quadrante";
        } else if (x < 0 && y < 0) {
            quadrante = "3º Quadrante";
        } else if (x > 0 && y < 0) {
            quadrante = "4º Quadrante";
        } else {
            quadrante = "QUADRANTE INVÁLIDO";
        }

        System.out.println("\n\nQuadrante: " + quadrante);
    }
}
