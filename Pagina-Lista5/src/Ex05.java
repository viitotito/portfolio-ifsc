package listarepeticoes;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
5. Escreva um algoritmo, que leia um conjunto de 10 fichas, cada uma
contendo, a altura e o código do sexo de uma pessoa (código = 1 se for
masculino e 2 se for feminino), e calcule e imprima:
-a maior altura da turma;
-a média de altura das mulheres;
-a média de altura da turma.
 */
public class Ex05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double altura, maiorAltura, mediaAlturaF, mediaAlturaTurma, contadorF;

        maiorAltura = 0;
        mediaAlturaTurma = 0;
        mediaAlturaF = 0;
        contadorF = 0;

        char sexo;

        for (int i = 0; i < 10; i++) {
            System.out.print("\nEntre com a altura: \n> ");
            altura = sc.nextDouble();

            System.out.print("\nEntre com o sexo: \n1 - Masculino\n2 - Feminino\n> ");
            sexo = sc.next().toUpperCase().charAt(0);

            if (sexo == '2') {
                mediaAlturaF += altura;
                contadorF++;
            }

            mediaAlturaTurma += altura;

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
        }

        System.out.println("\n\nMaior Altura: " + maiorAltura);
        System.out.println("\nMédia altura da turma: " + df.format(mediaAlturaTurma / 10));
        System.out.println("\nMédia altura das mulheres: " + df.format(mediaAlturaF / contadorF));
    }
}
