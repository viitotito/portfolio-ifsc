/*
18) Fa�a um programa que leia o dia, o m�s e o ano de nascimento de uma pessoa e o
dia, m�s e ano atual. Em seguida, o programa deve calcular e apresentar quantos dias a
pessoa j� viveu (considere que todos os meses t�m 30 dias e, por consequ�ncia, cada
ano tem 360 dias)
 */
package lista02;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        int dia_nasc, mes_nasc, ano_nasc, dia_atual, mes_atual, ano_atual, diasVividos;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEntre com o dia do seu nascimento: \n> ");
        dia_nasc = sc.nextInt();

        System.out.print("\nEntre com o m�s do seu nascimento: \n> ");
        mes_nasc = sc.nextInt();

        System.out.print("\nEntre com o ano do seu nascimento: \n> ");
        ano_nasc = sc.nextInt();

        System.out.print("\nEntre com o dia atual: \n> ");
        dia_atual = sc.nextInt();

        System.out.print("\nEntre com o m�s atual: \n> ");
        mes_atual = sc.nextInt();

        System.out.print("\nEntre com o ano atual: \n> ");
        ano_atual = sc.nextInt();

        diasVividos = (ano_atual - ano_nasc) * 360;

        System.out.println("\n\nNascimento: " + dia_nasc + "/" + mes_nasc + "/" + ano_nasc);
        System.out.println("\nData Atual: " + dia_atual + "/" + mes_atual + "/" + ano_atual);
        
        System.out.println("\n\nVoc� est� vivo h� "+diasVividos+" dias!");
    }
}
