package listarepeticoes;

import java.util.Scanner;

/**
 * 3. Elabore um algoritmos que leia o nome, idade, sexo de uma pessoa. O
 * algoritmo encerras se a idade lida for igual a zero. Mostre a quantidade de
 * repetições do algoritmo.
 */
public class Ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade, repeticoes;
        idade = 1;
        repeticoes = 0;
        String nome;
        char sexo;

        System.out.print("\nEntre com o seu nome: \n> ");
        nome = sc.nextLine();

        System.out.print("\nEntre com o seu sexo(M ou F): \n> ");
        sexo = sc.next().toUpperCase().charAt(0);

        while (idade != 0) {
            System.out.print("\n\nEntre com a sua idade: \n> ");
            idade = sc.nextInt();

            if(idade != 0){
                repeticoes++;
            }  
        }

        System.out.println("\n\nSeu nome é " + nome + ", seu sexo é " + sexo + " e sua idade é " + idade);
        System.out.println("\nRepetições: "+repeticoes);
    }
}
