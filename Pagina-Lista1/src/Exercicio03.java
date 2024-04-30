package aula08;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        String nome, telefone, endereco;

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o seu nome: ");
        nome = sc.nextLine();

        System.out.print("\nEntre com o seu telefone: ");
        telefone = sc.nextLine();

        System.out.print("\nEntre com o seu endereço: ");
        endereco = sc.nextLine();

        System.out.println("\nNome: " + nome + "\nTelefone: " + telefone + "\nEndereço: " + endereco);
    }

}
