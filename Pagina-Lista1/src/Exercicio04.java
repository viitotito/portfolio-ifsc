package aula08;

import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x, y;

        System.out.print("Entre com o valor de x: ");
        x = sc.nextInt();
        
        y = (3 * x) + 2;
        
        System.out.println("\nO valor de y é: "+y);
    }

}
