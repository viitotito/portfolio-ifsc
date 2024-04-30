/*
14) Faça um algoritmo que, tendo como dados de entrada a altura (h) e o gênero de uma
pessoa (M ou F), calcule seu peso ideal utilizando as seguintes fórmulas: Masculino: Peso
ideal = 72.7 * h - 58; Feminino: Peso ideal = 62.1 * h - 44.7. Caso o usuário digite uma
letra inválida para o gênero, o programa deve apresentar uma mensagem de erro.
 */
package lista03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        char genero;
        double altura, imc;

        System.out.print("\nEntre com a altura (h): \n> ");
        altura = sc.nextDouble();

        System.out.print("\nEntre com o gênero (M ou F): \n> ");
        genero = sc.next().toUpperCase().charAt(0);

        if (genero == 'M') {
            imc = 72.7 * altura - 58;
            System.out.println("\n\nPeso ideal: " + imc + "Kg.");
        } else if (genero == 'F') {
            imc = 62.1 * altura - 44.7;
            System.out.println("\n\nPeso ideal: " + imc + "Kg.");
        } else {
            System.out.println("\n\nLetra inválida!");
        }
    }
}
