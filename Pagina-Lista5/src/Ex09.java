package listarepeticoes;

import java.util.Scanner;

/**
 * 9. Construir um algoritmo que calcule o imposto de renda de um contribuinte,
 * considerando que seus dados (CPF, renda mensal e classe de renda) são valores
 * informados pelo usuário. Mostre na tela a alíquota de desconto aplicada e o
 * valor a ser descontado. O algoritmo encerra quando for informado o CPF 00
 *
 * CLASSE ALÍQUOTA A isento B 5% C 10% D 15% E 20
 */
public class Ex09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cpf;
        double rendaMensal, aliquota, valorDescontado;
        char classeRenda;

        aliquota = 0;
        do {
            System.out.print("\nEntre com o seu CPF: \n> ");
            cpf = sc.next();

            if (cpf.equals("00")) {
                System.out.println("\nSaindo...");
                break;
            }
            System.out.print("\nEntre com a sua renda mensal: \n>");
            rendaMensal = sc.nextDouble();

            System.out.print("\nSelecione sua classe de renda de acordo com a tabela: \n\n CLASSE ALÍQUOTA \n"
                    + " A isento \n"
                    + " B 5% \n"
                    + " C 10% \n"
                    + " D 15% \n"
                    + " E 20\n> ");

            classeRenda = sc.next().toUpperCase().charAt(0);

            switch (classeRenda) {
                case 'A':
                    aliquota = 0;
                    break;
                case 'B':
                    aliquota = 0.05;
                    break;
                case 'C':
                    aliquota = 0.1;
                    break;
                case 'D':
                    aliquota = 0.15;
                    break;
                case 'E':
                    aliquota = 0.2;
                    break;
                default:
                    break;
            }

            valorDescontado = rendaMensal * aliquota;

            System.out.println("\n\nCPF: " + cpf);
            System.out.println("\nRenda Mensal: " + rendaMensal);
            System.out.println("\nClasse de renda: " + classeRenda);
            System.out.println("\nAliquota aplicada: " + aliquota);
            System.out.println("Valor descontado: " + valorDescontado);
            System.out.println("\n\nSaldo final: " + (valorDescontado + rendaMensal));
        } while (!cpf.equals("00"));
    }
}
