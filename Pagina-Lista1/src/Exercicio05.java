package aula08;

import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float distanciaPercorrida, volumeCombustivel, mediaConsumo;

        System.out.print("Entre com a dist�ncia percorrida (Km): ");
        distanciaPercorrida = sc.nextFloat();
        
        System.out.print("\nEntre com o volume de combust�vel gasto (L): ");
        volumeCombustivel = sc.nextFloat();
        
        mediaConsumo = distanciaPercorrida / volumeCombustivel;
        
        System.out.println("\nA m�dia de consumo de combust�vel �: "+mediaConsumo+" Km/L");
    }

}
