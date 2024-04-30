/*
 14) Considere que o último concurso vestibular apresentou três provas: Português,
Matemática e Conhecimentos Gerais. Para cada candidato tem-se um registro
contendo o seu nome e as notas obtidas em cada uma das provas. Construa um
programa que leia estes dados e apresente: 
a) o nome e as notas em cada prova do candidato.
b) a média do candidato.
c) uma informação dizendo se o candidato foi aprovado ou não. Considere que um
candidato é aprovado se sua média for maior que 7.0 e se não apresentou
nenhuma nota abaixo de 5.
 */
package lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        String nome;
        double notaPortugues, notaMatematica, notaCGerais, media;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInsira o nome do aluno: \n> ");
        nome = sc.nextLine();

        System.out.print("\nEntre com a nota da prova de português: \n> ");
        notaPortugues = sc.nextDouble();

        System.out.print("\nEntre com a nota da prova de matemática: \n> ");
        notaMatematica = sc.nextDouble();

        System.out.print("\nEntre com a nota da prova de conhecimentos gerais: \n> ");
        notaCGerais = sc.nextDouble();

        media = (notaPortugues + notaMatematica + notaCGerais) / 3;

        System.out.println("\n\nNome do candidato: " + nome);
        System.out.println("\nPortuguês: " + notaPortugues);
        System.out.println("\nMatemática: " + notaMatematica);
        System.out.println("\nConhecimentos Gerais: " + notaCGerais);

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("\n\nMédia candidato: " + df.format(media));

        if (media > 7) {
            if (notaPortugues > 5 && notaMatematica > 5 && notaCGerais > 5) {
                System.out.println("\n\nCandidato Aprovado!");
            } else {
                System.out.println("\n\nCandidato Reprovado.");
            }
        } else {
            System.out.println("\n\nCandidato Reprovado.");
        }
    }
}
