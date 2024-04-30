/*
7. Fa�a um programa para calcular a conta final de um h�spede de um hotel
fict�cio, considerando que: . Devem ser lidos o nome do h�spede, o tipo do
apartamento utilizado (A, B, C), o n�mero de di�rias utilizadas pelo h�spede
(que dever� ser superior a zero);
 O valor da di�ria � determinado pela seguinte tabela:
TIPO DO APTO    ? VALOR DA DI�RIA (R$)
A               ? 150.00
B               ? 100.00
C               ? 75.00
Calcule o total a pagar ( total a pagar � o valor da di�ria multiplicado pelo
numero de dias hospedados)
? Escreva a conta final contendo: o nome do h�spede, o tipo do
apartamento, valor total das di�rias.
? Para cadastrar os dados de novo h�spede pergunte Deseja continuar
S/N.
 */
package listarepeticoes;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char continuar, tipoApartamento;
        String nome = " ";
        double valorTotal = 0;
        int diarias;

        do {

            System.out.print("\nDeseja continuar (S/N)?\n> ");
            continuar = sc.next().toUpperCase().charAt(0);

            if (continuar == 'N') {
                System.out.println("\nSaindo do programa...");

            } else if (continuar == 'S') {
                System.out.print("\nEntre com o seu nome: \n> ");
                nome = sc.next();

                do {
                    System.out.print("\nEntre com o n�mero de di�rias: \n> ");
                    diarias = sc.nextInt();

                    if (diarias <= 0) {
                        System.out.println("\nO n�mero de di�rias deve ser maior que 0!");
                    }

                } while (diarias <= 0);

                System.out.print("\nEscolha um dos tipos do apartamento: \n\nTIPO DO APTO    | VALOR DA DI�RIA (R$)\n"
                        + "A               | 150.00\n"
                        + "B               | 100.00\n"
                        + "C               | 75.00\n> ");

                tipoApartamento = sc.next().toUpperCase().charAt(0);

                switch (tipoApartamento) {
                    case 'A':
                        valorTotal = diarias * 150.00;
                        break;

                    case 'B':
                        valorTotal = diarias * 100.00;
                        break;
                    case 'C':
                        valorTotal = diarias * 50.00;
                        break;
                    default:
                        System.out.println("\nEntre com um tipo v�lido!");
                        break;
                }

                System.out.println("\nNome do h�spede: " + nome);
                System.out.println("\nQuantidade de di�rias: " + diarias);
                System.out.println("\nApartamento escolhido: " + tipoApartamento);
                System.out.println("\nValor total a pagar: " + valorTotal);
            } else {
                System.out.println("\nEntre com um op��o v�lida!");
            }
        } while (continuar != 'N');
    }
}
