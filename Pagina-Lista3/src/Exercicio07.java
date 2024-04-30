/*
7) Crie um programa para auxiliar engenheiros a calcular a quantidade de piso a ser
utilizado em uma sala retangular, a quantidade de tinta a ser gasta nas paredes, bem
como a potÍncia do ar-condicionado. Para isto, o programa deve ler o comprimento, a
largura e a altura da sala, calcular e imprimir a ·rea de piso da sala, a ·rea total das
paredes e o volume da sala. O programa deve mostrar tambÈm o tamanho do aparelho de
ar-condicionado a ser instalado. Um pequeno deve ser instalado se o volume da sala for
inferior a 100 m3
; um aparelho mÈdio deve ser instalado se o volume da sala estiver entre
100 e 500 m3
; e um aparelho grande deve ser instalado caso o volume seja superior a 500
m3

 */
package lista02;

import java.util.Scanner;

public class Exercicio07 {
    
    public static void main(String[] args){
        double comprimento, largura, altura, areaPiso, areaParedes, volumeSala;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entre com a altura:\n> ");
        altura = sc.nextDouble();
        
        System.out.print("\nEntre com o comprimento:\n> ");
        comprimento = sc.nextDouble();
        
        System.out.print("\nEntre com a largura:\n> ");
        largura = sc.nextDouble();
        
        areaPiso = comprimento * largura;
        areaParedes = 2 * (comprimento * altura + largura * altura);
        volumeSala = comprimento * largura * altura;
        
        System.out.print("\n\n¡rea do piso: "+areaPiso);
        System.out.println("\n\n¡rea das paredes: "+areaParedes);
        System.out.println("\n\nVolume da sala: "+volumeSala);
    }
}
