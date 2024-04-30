/*
2) O sistema de avalia��o de uma disciplina � composto de duas provas e um trabalho.
Para ser aprovado, o aluno precisa ter nota igual ou superior a sete no trabalho e nota
igual ou superior a seis em pelo menos uma das provas. Observe que n�o se deve
calcular a m�dia das notas. Fa�a um programa que leia as tr�s notas do aluno e
apresente se ele deve ser aprovado ou n�o.
O programa deve apresentar a mensagem "Parab�ns, voc� foi aprovado" ou
"Infelizmente, voc� n�o foi aprovado", de acordo com as notas do aluno.

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
            System.out.println("\n\nParab�ns, voc� foi aprovado!");
        } else {
            System.out.println("\n\nInfelizmente, voc� n�o foi aprovado.");
        }

    }

}
