package aula08;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        
        int numeroInteiro;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um n�mero inteiro: ");
        numeroInteiro = sc.nextInt();

        System.out.println("\nO n�mero digitado foi " + numeroInteiro);

        System.out.println("\nO antecessor do n�mero � " + (numeroInteiro - 1));

        System.out.println("\nO sucessor do n�mero � " + (numeroInteiro + 1));
    }

}
