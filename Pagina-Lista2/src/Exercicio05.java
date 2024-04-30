package listaex01;

import java.util.Scanner;

/*
Crie um programa que leia as medidas da base e altura de um retângulo, calcule e
apresente a área e o perímetro deste retângulo.
 */
public class Exercicio05 {

    public static void main(String[] args) {
        double base, altura, area, perimetro;
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o valor da base do retângulo:\n> ");
        base = sc.nextDouble();

        System.out.print("\nEntre com o valor da altura do retângulo:\n> ");
        altura = sc.nextDouble();

        area = base * altura;
        perimetro = 2 * (base + altura);

        System.out.println("\nÁrea: " + area + "\nPerímetro: " + perimetro);
    }
}
