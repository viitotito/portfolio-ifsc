/*
17) Faça um programa que leia um peso na Terra e o código de um planeta e imprima o
valor do seu peso neste planeta.
1. Mercúrio
2. Vênus
3. Marte
4. Júpiter
5. Saturno
6. Urano
7. Netuno
 */
package lista03;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pesoTerra;
        int codPlaneta;

        System.out.print("\nEntre com um peso na terra (Kg): \n> ");
        pesoTerra = sc.nextDouble();

        System.out.print("\nEntre com o código de um dos planetas listados: \n1 - Mercúrio\n2 - Vênus\n3 - Marte\n4 - Júpiter\n5 - Saturno\n6 - Urano\n7 - Netuno\n\n> ");
        codPlaneta = sc.nextInt();

        if (codPlaneta == 1) {
            System.out.println("\n\nPeso Mercúrio: " + (pesoTerra * 0.37));
        } else if (codPlaneta == 2) {
            System.out.println("\n\nPeso Vênus: " + (pesoTerra * 0.88));
        } else if (codPlaneta == 3) {
            System.out.println("\n\nPeso Marte: " + (pesoTerra * 0.38));
        } else if (codPlaneta == 4) {
            System.out.println("\n\nPeso Júpiter: " + (pesoTerra * 2.64));
        } else if (codPlaneta == 5) {
            System.out.println("\n\nPeso Saturno: " + (pesoTerra * 1.15));
        } else if (codPlaneta == 6) {
            System.out.println("\n\nPeso Urano: " + (pesoTerra * 1.17));
        } else if (codPlaneta == 7) {
            System.out.println("\n\nPeso Netuno: " + (pesoTerra * 1.18));
        } else {
            System.out.println("\n\nCódigo inválido.");
        }
    }
}
