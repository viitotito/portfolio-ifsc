package listarepeticoes;

import java.util.Scanner;

/**
 * 8. Escreva um programa para determinar o tipo de bilhete que cada visitante
 * de um parque de diversão deve comprar. O tipo de bilhete é determinado em
 * função da idade do visitante, de acordo com a tabela abaixo. * Idade |
 * Bilhete Inferior a 6 | Insento de pagamento Entre 6 a 12 | Bilhete de criança
 * Entre 13 a 65 | Bilhete normal Mais de 65 | Bilhete de 3ª idade
 *
 * O programa deverá solicitar a leitura de um novo bilhete. A execução do
 * programa deverá encerrar quando o usuário informa ?não?. Mostre no final a
 * quantidade de bilhetes infantis e adultos vendidos.
 */
public class Ex08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String continuar, bilhete;
        int idade, qtdInfantis, qtdAdultos;
        qtdInfantis = 0;
        qtdAdultos = 0;

        do {

            System.out.print("\nDeseja continuar (sim/nao)?\n> ");
            continuar = sc.next().toUpperCase();

            if (continuar.equals("NAO") || continuar.equals("NÃO")) {
                System.out.println("\nSaindo do programa...");

            } else if (continuar.equals("SIM")) {
                System.out.print("\nEntre com a sua idade: \n> ");
                idade = sc.nextInt();

                if (idade < 6) {
                    bilhete = "Insento de pagamento";
                    qtdInfantis++;
                } else if (idade >= 6 && idade <= 12) {
                    bilhete = "Bilhete de criança";
                    qtdInfantis++;
                } else if (idade >= 13 && idade <= 65) {
                    bilhete = "Bilhete normal";
                    qtdAdultos++;
                } else {
                    bilhete = "Bilhete 3ª idade";
                    qtdAdultos++;
                }

                System.out.println("\nBilhete: " + bilhete);
                System.out.println("\nQuantidade adultos: " + qtdAdultos);
                System.out.println("\nQuantidade infantis: " + qtdInfantis);

            } else {
                System.out.println("\nEntre com um opção válida!");
            }
        } while (!(continuar.equals("NAO") || continuar.equals("NÃO")));
    }
}
