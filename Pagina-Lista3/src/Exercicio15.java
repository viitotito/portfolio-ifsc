/*
15) Faça um programa leia o salário bruto e o número de dependentes de um funcionário
e calcule o seu salário líquido. Para calcular o salário líquido, deve-se descontar:
- 11% de INSS;
- 15% de Imposto de renda.
Após os descontos, deve-se adicionar um auxílio de R$ 150,00 por dependente.
 */
package lista02;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        double salarioBruto, salarioLiquido;
        int dependentes;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEntre com o valor do salário bruto: \n> ");
        salarioBruto = sc.nextDouble();

        System.out.print("\nEntre com o número de dependentes do funcionário: \n> ");
        dependentes = sc.nextInt();

        salarioLiquido = 150 * dependentes + (salarioBruto - (salarioBruto * 0.11 + salarioBruto * 0.15));

        System.out.println("\n\nSalário bruto: " + salarioBruto);
        System.out.println("\nDesconto INSS: " + (salarioBruto * 0.11));
        System.out.println("\nDesconto IRPF: " + (salarioBruto * 0.15));

        System.out.println("\n\nDependentes: " + dependentes);
        System.out.println("\nSalário líquido: " + salarioLiquido);
    }
}
