package listaex01;

import java.util.Scanner;

/*
Fa�a um programa que leia um n�mero inteiro e apresente o quociente e o resto da
divis�o deste n�mero por 2.
 */
public class Exercicio10 {

    public static void main(String[] args) {
        int numero, quociente, resto;
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um valor inteiro:\n> ");
        numero = sc.nextInt();
        
        quociente = numero / 2;
        resto = numero % 2;
        
        System.out.println("\nQuociente: " + quociente + "\nResto: " + resto );
    }
}
