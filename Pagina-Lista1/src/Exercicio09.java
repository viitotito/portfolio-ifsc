package aula08;

import java.util.Scanner;

public class Exercicio09 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double grauCelsius, grauFahrenheit;

        System.out.print("Entre com a temperatura em Graus Celsius (Cº): ");
        grauCelsius = sc.nextDouble();
        
        grauFahrenheit = (9 * grauCelsius + 160) / 5;
        System.out.println("\nA temperatura em Fahrenheit é "+grauFahrenheit+"!");

    }

}
