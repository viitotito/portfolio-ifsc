/*
7. Faça um programa para calcular a conta final de um hóspede de um hotel
fictício, considerando que: . Devem ser lidos o nome do hóspede, o tipo do
apartamento utilizado (A, B, C), o número de diárias utilizadas pelo hóspede
(que deverá ser superior a zero);
 O valor da diária é determinado pela seguinte tabela:
TIPO DO APTO    ? VALOR DA DIÁRIA (R$)
A               ? 150.00
B               ? 100.00
C               ? 75.00
Calcule o total a pagar ( total a pagar é o valor da diária multiplicado pelo
numero de dias hospedados)
? Escreva a conta final contendo: o nome do hóspede, o tipo do
apartamento, valor total das diárias.
? Para cadastrar os dados de novo hóspede pergunte Deseja continuar
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
                    System.out.print("\nEntre com o número de diárias: \n> ");
                    diarias = sc.nextInt();

                    if (diarias <= 0) {
                        System.out.println("\nO número de diárias deve ser maior que 0!");
                    }

                } while (diarias <= 0);

                System.out.print("\nEscolha um dos tipos do apartamento: \n\nTIPO DO APTO    | VALOR DA DIÁRIA (R$)\n"
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
                        System.out.println("\nEntre com um tipo válido!");
                        break;
                }

                System.out.println("\nNome do hóspede: " + nome);
                System.out.println("\nQuantidade de diárias: " + diarias);
                System.out.println("\nApartamento escolhido: " + tipoApartamento);
                System.out.println("\nValor total a pagar: " + valorTotal);
            } else {
                System.out.println("\nEntre com um opção válida!");
            }
        } while (continuar != 'N');
    }
}
