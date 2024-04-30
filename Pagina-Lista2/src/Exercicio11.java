package listaex01;

import java.util.Scanner;

/*
(DESAFIO) Crie um programa que leia um número inteiro que representa a
quantidade de segundos de um vídeo. O programa deve calcular e apresentar quantas
horas, minutos e segundos dura este vídeo.
 */
public class Exercicio11 {

    public static void main(String[] args) {
        int segundos, h, m, s;
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a quantidade de segundos de um vídeo:\n> ");
        segundos = sc.nextInt();
        
        h = (segundos / 3600);
        m = (segundos % 3600) / 60;
        s = (segundos % 3600) % 60;
        
        System.out.println("\nDuração do vídeo: " + h + "h" + m + "m" + s + "s");
    }
}
