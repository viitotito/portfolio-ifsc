/*
10) Faça um programa que leia três valores X, Y e Z e verifique se eles podem ser os
comprimentos dos lados de um triângulo, e se forem, deve verificar se é um triângulo
equilátero, isóscele ou escaleno. Se eles não formarem um triângulo, o programa deve
escrever uma mensagem indicando.
Propriedade – o comprimento de cada lado de um triângulo é menor do que a soma dos
comprimentos dos outros dois lados.
Definição 1 - chama-se de triângulo equilátero o que tem os comprimentos dos três lados
iguais;
Definição 2 - chama-se de triângulo isóscele o triângulo que tem os comprimentos de
dois lados iguais;
Definição 3 - chama-se triângulo escaleno o triângulo que tem os comprimentos dos três
lados diferentes.
 */
package lista03;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, z;
        String tipoTriangulo = "";

        System.out.print("\nEntre com o valor do lado X: \n> ");
        x = sc.nextInt();

        System.out.print("\nEntre com o valor do lado Y: \n> ");
        y = sc.nextInt();

        System.out.print("\nEntre com o valor do lado Z: \n> ");
        z = sc.nextInt();

        if (x < (y + z) && y < (x + z) && z < (x + y)) {
            if (x == y && x == z && y == z) {
                tipoTriangulo = "TRIÂNGULO EQUILÁTERO!";
            } else if (x == y || x == z || y == z) {
                tipoTriangulo = "RIÂNGULO IS�SCELE!";
            } else if (x != y && x != z && y != z) {
                tipoTriangulo = "TRIÂNGULO ESCALENO!";
            }
        } else {
            tipoTriangulo = "NÃO É TRIÂNGULO!";
        }

        System.out.println("\n\nTipo do triângulo: " + tipoTriangulo);
    }
}
