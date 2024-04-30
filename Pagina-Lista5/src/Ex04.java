package listarepeticoes;

import java.util.Scanner;

/**
 * 4. O card�pio de uma lancheria � o seguinte: * Especifica��o C�digo Pre�o
 * Cachorro quente 100 4,00 X Salada 101 6,00 Bauru com ovo 102 6,50
 * Refrigerante 103 2,00
 *
 * Escrever um algoritmo que mostre o card�pio para o usu�rio e permita que o
 * usu�rio informe o c�digo do item pedido, a quantidade e calcule o valor a ser
 * pago por aquele lanche. Mostre na tela o item pedido e o valor a ser pago.
 */
public class Ex04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String codigo;
        int quantidade;
        double valor = 0;

        System.out.println("=======<CARD�PIO>=======");
        System.out.println("\nEspecifica��o     C�digo    Pre�o\n\n"
                + "Cachorro quente   100       4,00\n"
                + "X Salada          101       6,00\n"
                + "Bauru com ovo     102       6,50\n"
                + "Refrigerante      103       2,00");

        System.out.print("\nEscolha um dos itens utilizando o c�digo: \n> ");
        codigo = sc.nextLine();

        System.out.print("\nInsira a quantidade desejada: \n> ");
        quantidade = sc.nextInt();

        switch (codigo) {
            case "100":
                for (int i = 0; i < quantidade; i++) {
                    valor += 4.00;
                }
                break;

            case "101":
                for (int i = 0; i < quantidade; i++) {
                    valor += 6.00;
                }
                break;

            case "102":
                for (int i = 0; i < quantidade; i++) {
                    valor += 6.50;
                }
                break;

            case "103":
                for (int i = 0; i < quantidade; i++) {
                    valor += 2.00;
                }
                break;

            default:
                System.out.println("Entre com um c�digo v�lido!");
                break;
        }
        System.out.println("\n\nO valor total a ser pago � " + valor + "!");
    }
}
