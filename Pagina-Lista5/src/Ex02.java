package listarepeticoes;

import java.util.Scanner;

/**
2. Elabore um algoritmo que leia dois n�meros inteiros. O segundo n�mero lido
dever� ser maior que o primeiro n�mero. Mostre a soma dos dois n�meros
lidos.
 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int val1, val2, soma;
        val1 = 2;
        val2 = 1;
        soma = 0;
        
        while(val1 > val2){
        System.out.print("\nEntre com o primeiro valor:\n> ");
        val1 = sc.nextInt();
        
        System.out.print("\nEntre com o segundo valor:\n> ");
        val2 = sc.nextInt();
        
        if(val1 > val2){
            System.out.println("\nO segundo n�mero deve ser maior que o primeiro!");
        }
        else{
            soma = val1 + val2;
        }
        }
        
        System.out.println("\nA soma dos valores � "+soma);
    }
}
