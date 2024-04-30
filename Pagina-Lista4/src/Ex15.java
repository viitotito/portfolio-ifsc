/*
15) Faça um algoritmo que, dada a idade de um nadador, classifique-o em uma das
seguintes categorias: Infantil (5 -10 anos); Juvenil (11 - 17 anos); Adulto (18 - 60 anos);
Senior (Acima de 60 anos). 
 */
package lista03;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        String categoria;

        System.out.print("\nEntre com a idade do nadador: \n> ");
        idade = sc.nextInt();

        if (idade >= 5 && idade <= 10) {
            categoria = "INFANTIL";
        } else if (idade >= 11 && idade <= 17) {
            categoria = "JUVENIL";
        } else if (idade >= 18 && idade <= 60) {
            categoria = "ADULTO";
        } else if (idade > 60) {
            categoria = "SENIOR";
        } else {
            categoria = "NÃO PODE PARTICIPAR!";
        }

        System.out.println("\n\nCategoria: " + categoria);
    }

}
