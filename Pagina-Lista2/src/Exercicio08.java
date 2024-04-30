package listaex01;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 Uma revendedora de carros paga a seus vendedores um sal�rio fixo equivalente a dois
sal�rios-m�nimos, mais uma comiss�o de R$ 150,00 por carro vendido e mais uma
comiss�o de 5% do valor das vendas. Crie um programa que leia o valor do sal�rio m�nimo, quantos carros o vendedor vendeu ao longo do m�s e o valor total das vendas.
Ap�s ler os dados, o programa deve calcular e apresentar o valor do sal�rio do
funcion�rio. 
 */
public class Exercicio08 {

    public static void main(String[] args) {
        double salMinimo, salario, valorVendas;
        int quantVendida;

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o valor do sal�rio m�nimo:\n> ");
        salMinimo = sc.nextDouble();

        System.out.print("\nEntre com a quantidade de carros vendidos:\n> ");
        quantVendida = sc.nextInt();

        System.out.print("\nEntre com o valor total das vendas:\n> ");
        valorVendas = sc.nextDouble();

        salario = (salMinimo * 2) + (150 * quantVendida) + (0.05 * valorVendas);

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("\nEntrada:");
        System.out.println("\nSal�rio M�nimo: " + salMinimo + "\nQuantidade de vendas: " + quantVendida + "\nValor total das vendas: " + valorVendas);
        System.out.println("\nSal�rio Funcion�rio: " + df.format(salario));

    }
}
