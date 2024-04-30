/*
10) (DESAFIO) Observe a seguinte regra aeronáutica (fictícia). Para que um avião possa
decolar de um aeroporto, várias condições devem ser satisfeitas: caso a pista seja menor
que 1,5 Km, o avião deve pesar menos que 40 toneladas, caso a pista possua entre 1,5 e
2 Km, o avião não deve ultrapassar as 60 toneladas. Caso a pista seja superior a 2 Km,
qualquer avião pode decolar. Caso a visibilidade seja inferior a 20 metros, apenas aviões
com sistema de decolagem computadorizada podem decolar. Se estiver chovendo acima
de 5 mm, nenhum avião pode decolar. Se o avião possuir mais de 100 passageiros e
estiver chovendo (independente da intensidade), o avião não pode decolar. Escreva um
programa que leia o tamanho da pista, o peso do avião, visibilidade, intensidade da chuva
(o usuário deve digitar 0 caso não esteja chovendo), número de passageiros e se possui
sistema de decolagem automatizada, e indique se o avião pode decolar ou não.
 */
package lista02;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        double tamPista, peso;
        int visibilidade, chuva, passageiros;
        boolean sistemaDecolagem;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEntre com o tamanho da pista (Km): \n> ");
        tamPista = sc.nextDouble();

        System.out.print("\nEntre com o peso do avião (t): \n> ");
        peso = sc.nextDouble();

        System.out.print("\nEntre com a visibilidade (m): \n> ");
        visibilidade = sc.nextInt();

        System.out.print("\nEntre com a intensidade da chuva (mm): \n> ");
        chuva = sc.nextInt();

        System.out.print("\nEntre com a quantidade de passageiros: \n> ");
        passageiros = sc.nextInt();

        System.out.print("\nO avião possui sistema de decolagem? (true ou false): \n> ");
        sistemaDecolagem = sc.nextBoolean();

        if (tamPista <= 1.5 && peso <= 40 || tamPista <= 2 && peso < 60 || tamPista > 2) {
            if (chuva <= 5 && passageiros <= 100 || chuva == 0) {
                if (visibilidade <= 20 && sistemaDecolagem == true || visibilidade >= 20) {
                    System.out.println("\n\nArrumem seus cintos e boa viagem!");
                } else {
                    System.out.println("\n\nAvião não decola!");
                }
            } else {
                System.out.println("\n\nAvião não decola!");
            }
        } else {
            System.out.println("\n\nAvião não decola!");
        }
    }

}
