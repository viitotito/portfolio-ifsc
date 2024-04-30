/*
8) Sabendo que a velocidade do som é de 340 m/s, crie um programa para calcular a
distância de onde o raio caiu até a pessoa. Para isto, a pessoa deve informar o tempo que
transcorreu entre ela ter visto o raio e ter ouvido o som do trovão. O tempo deve ser
informado em segundos e deve ser um valor real, pois a pessoa poderá usar um
cronômetro de precisão. Além disto, o programa deve apresentar se o raio representou
algum perigo a pessoa. Um raio representa perigo se ele cair a menos de 200m da
pessoa.
 */
package lista02;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        double tempo, distancia;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEntre com a diferença de tempo entre a visualização do raio e o barulho do trovão (s):\n> ");
        tempo = sc.nextDouble();

        distancia = tempo * 340;

        System.out.println("\n\nO raio caiu a " + distancia + "m de você!");

        if (distancia < 200) {
            System.out.println("\n\nPERIGO!, encontre um local seguro contra raios!");
        } else {
            System.out.println("\n\nDistância segura...");
        }
    }
}
