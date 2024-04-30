package listarepeticoes;

import java.util.Scanner;

/**
 * 6. Um cinema possui capacidade de 20 lugares e est� sempre com ocupa��o
 * total. Certo dia, cada espectador respondeu a um question�rio, no qual
 * constava: - sua idade; -sua opini�o em rela��o ao filme, segundo as seguintes
 * notas: Nota Significado A �timo B Bom C Regular D
 *
 * Elabore um algoritmo que, lendo estes dados, calcule e imprima: -a quantidade
 * de respostas �timo; -a m�dia de idade das pessoas que responderam ruim; -a
 * diferen�a de idade entre a pessoa de maior idade com a pessoa de menor de
 * idade que responderam o question�rio.
 */
public class Ex06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, qtdNotasOtimas, qtdNotasRuins, mediaIdadeNotasRuins, maiorIdade, menorIdade;
        char nota;
        maiorIdade = 0;
        menorIdade = 1000;
        mediaIdadeNotasRuins = 0;

        qtdNotasOtimas = 0;
        qtdNotasRuins = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("\nEntre com a sua idade: \n> ");
            idade = sc.nextInt();

            System.out.print("\nEntre com a sua nota de acordo com a tabela: \n Nota     Significado \n\n"
                    + " A        �timo \n"
                    + " B        Bom \n"
                    + " C        Regular D\n> ");

            nota = sc.next().toUpperCase().charAt(0);

            if (idade > maiorIdade) {
                maiorIdade = idade;
            } else if (idade < menorIdade) {
                menorIdade = idade;
            }

            if (nota == 'A') {
                qtdNotasOtimas++;
            } else if (nota == 'D') {
                mediaIdadeNotasRuins += idade;
                qtdNotasRuins++;
            }

        }

        System.out.println("\n\nNotas �timas: " + qtdNotasOtimas);
        System.out.println("\nM�dia idade das pessoas que avaliaram com D: " + (mediaIdadeNotasRuins / qtdNotasRuins));
        System.out.println("\nDiferen�a de idade entre a maior idade e a menor idade: " + (maiorIdade - menorIdade));
    }
}
