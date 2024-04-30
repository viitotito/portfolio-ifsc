package listarepeticoes;

import java.util.Scanner;

/**
 * 6. Um cinema possui capacidade de 20 lugares e está sempre com ocupação
 * total. Certo dia, cada espectador respondeu a um questionário, no qual
 * constava: - sua idade; -sua opinião em relação ao filme, segundo as seguintes
 * notas: Nota Significado A Ótimo B Bom C Regular D
 *
 * Elabore um algoritmo que, lendo estes dados, calcule e imprima: -a quantidade
 * de respostas ótimo; -a média de idade das pessoas que responderam ruim; -a
 * diferença de idade entre a pessoa de maior idade com a pessoa de menor de
 * idade que responderam o questionário.
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
                    + " A        Ótimo \n"
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

        System.out.println("\n\nNotas Ótimas: " + qtdNotasOtimas);
        System.out.println("\nMédia idade das pessoas que avaliaram com D: " + (mediaIdadeNotasRuins / qtdNotasRuins));
        System.out.println("\nDiferença de idade entre a maior idade e a menor idade: " + (maiorIdade - menorIdade));
    }
}
