/*
5) O sistema de avaliação de uma disciplina é composto de duas provas e um trabalho.
Para ser aprovado, o aluno precisa ter nota igual ou superior a sete no trabalho e nota
igual ou superior a seis em pelo menos uma das provas. Observe que não se deve
calcular a média das notas. Faça um programa que leia as três notas do aluno e
apresente se ele deve ser aprovado ou não.
 */
package lista02;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        double trabalho, prova1, prova2;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEntre com a nota da primeira prova:\n> ");
        prova1 = sc.nextDouble();

        System.out.print("\nEntre com a nota da segunda prova:\n> ");
        prova2 = sc.nextDouble();

        System.out.print("\nEntre com a nota do trabalho:\n> ");
        trabalho = sc.nextDouble();

        if (((prova1 >= 6) || (prova2 >= 6)) && (trabalho >= 7)) {
            System.out.println("\n\nAluno Aprovado!");
        } else {
            System.out.println("\n\nAluno Reprovado.");
        }
    }
}
