package listarepeticoes;

import java.util.Scanner;

/**
1. Escreva uma algoritmo que leia dois valores. O algoritmo encerra quando o
primeiro valor informado for igual ao segundo valor.
 */
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int val1, val2;
        val1 = 1;
        val2 = 2;
        
        while(val1 != val2){
        System.out.print("\nEntre com o primeiro valor:\n> ");
        val1 = sc.nextInt();
        
        System.out.print("\nEntre com o segundo valor:\n> ");
        val2 = sc.nextInt();
        }
        
        System.out.println("\n\nNúmeros iguais! Fechando a aplicação...");
    }
}
