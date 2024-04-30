package aula08;

import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float distanciaPercorrida, volumeCombustivel, mediaConsumo;

        System.out.print("Entre com a distância percorrida (Km): ");
        distanciaPercorrida = sc.nextFloat();
        
        System.out.print("\nEntre com o volume de combustível gasto (L): ");
        volumeCombustivel = sc.nextFloat();
        
        mediaConsumo = distanciaPercorrida / volumeCombustivel;
        
        System.out.println("\nA média de consumo de combustível é: "+mediaConsumo+" Km/L");
    }

}
