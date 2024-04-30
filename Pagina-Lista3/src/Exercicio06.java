/*
6) Crie uma nova o programa da quest�o 5, para que ele considere a frequ�ncia do aluno.
Agora, para ser aprovado o aluno precisa ter nota igual ou superior a sete no trabalho,
nota igual ou superior a seis em pelo menos uma das provas e frequ�ncia igual ou
superior a 75%. Al�m desta diferen�a, caso o aluno tenha nota seis no trabalho ele
poder� ser aprovado, mas para isto precisa ter frequ�ncia igual ou superior a 90%
 */
package lista02;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        double trabalho, prova1, prova2, frequencia;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEntre com a nota da primeira prova:\n> ");
        prova1 = sc.nextDouble();

        System.out.print("\nEntre com a nota da segunda prova:\n> ");
        prova2 = sc.nextDouble();

        System.out.print("Entre com a nota do trabalho:\n> ");
        trabalho = sc.nextDouble();

        System.out.print("\nEntre com a frequ�ncia:\n> ");
        frequencia = sc.nextDouble();

        if (prova1 >= 6 || prova2 >= 6)  {
            if (frequencia >= 75 && trabalho >= 7 || frequencia >= 90 && trabalho >= 6) {
                System.out.println("\n\nAluno Aprovado!");
            } else {
                System.out.println("\n\nAluno Reprovado.");
            }
        } else {
            System.out.println("\n\nAluno Reprovado.");
        }
    }
}
