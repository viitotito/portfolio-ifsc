/*
15) Fa�a um programa leia o sal�rio bruto e o n�mero de dependentes de um funcion�rio
e calcule o seu sal�rio l�quido. Para calcular o sal�rio l�quido, deve-se descontar:
- 11% de INSS;
- 15% de Imposto de renda.
Ap�s os descontos, deve-se adicionar um aux�lio de R$ 150,00 por dependente.
 */
package lista02;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        double salarioBruto, salarioLiquido;
        int dependentes;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEntre com o valor do sal�rio bruto: \n> ");
        salarioBruto = sc.nextDouble();

        System.out.print("\nEntre com o n�mero de dependentes do funcion�rio: \n> ");
        dependentes = sc.nextInt();

        salarioLiquido = 150 * dependentes + (salarioBruto - (salarioBruto * 0.11 + salarioBruto * 0.15));

        System.out.println("\n\nSal�rio bruto: " + salarioBruto);
        System.out.println("\nDesconto INSS: " + (salarioBruto * 0.11));
        System.out.println("\nDesconto IRPF: " + (salarioBruto * 0.15));

        System.out.println("\n\nDependentes: " + dependentes);
        System.out.println("\nSal�rio l�quido: " + salarioLiquido);
    }
}
