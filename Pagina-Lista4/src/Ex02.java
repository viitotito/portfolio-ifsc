/*
2) O sistema de avaliação de uma disciplina é composto de duas provas e um trabalho.
Para ser aprovado, o aluno precisa ter nota igual ou superior a sete no trabalho e nota
igual ou superior a seis em pelo menos uma das provas. Observe que não se deve
calcular a média das notas. Faça um programa que leia as três notas do aluno e
apresente se ele deve ser aprovado ou não.
O programa deve apresentar a mensagem "Parabéns, você foi aprovado" ou
"Infelizmente, você não foi aprovado", de acordo com as notas do aluno.

 */
package lista03;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        double p1, p2, t;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEntre com a nota da primeira prova: \n> ");
        p1 = sc.nextDouble();

        System.out.print("\nEntre com a nota da segunda prova: \n> ");
        p2 = sc.nextDouble();

        System.out.print("\nEntre com a nota do trabalho: \n> ");
        t = sc.nextDouble();

        if ((t >= 7) && (p1 >= 6 || p2 >= 6)) {
            System.out.println("\n\nParabéns, você foi aprovado!");
        } else {
            System.out.println("\n\nInfelizmente, você não foi aprovado.");
        }

    }

}
