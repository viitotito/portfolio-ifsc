/*
19) Desafio - Crie um algoritmo que leia uma data (dia, mês e ano ? números inteiros
separados) e imprima se a data é válida ou não. Para uma data ser válida, o ano deve ser
um número entre 0 e 9999. Além disto, deve-se verificar se a quantidade de dias digitadas
é compatível com o mês. Não esqueça de verificar se o ano é bissexto ou não.
 */
package Lista03;

import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia, mes, ano;
        boolean dataValida, bissexto;
  
        System.out.print("\nDia: \n> ");
        dia = sc.nextInt();

        System.out.print("\nMês (0 a 12): \n> ");
        mes = sc.nextInt();

        System.out.print("\nAno (0 a 9999): \n> ");
        ano = sc.nextInt();

        if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
            bissexto = true;
        }
        else{
            bissexto = false;
        }

        if(ano >= 0 && ano <= 9999){
            if(mes > 0 && mes < 13){
                if(bissexto == true && dia <= 29 && dia >= 1 && mes == 2){
                    dataValida = true;
                }
                else if(bissexto == false && dia <= 28 && dia >= 1 && mes == 2){
                    dataValida = true;
                }
                else if(mes != 2 && mes % 2 != 0 && dia <= 31 || mes != 2 && mes == 8 && dia <= 31){
                    dataValida = true;
                }
                else if(mes != 2 && mes % 2 == 0 && dia <= 30){
                    dataValida = true;
                }
                else{
                    dataValida = false;
                }
            }
            else{
                dataValida = false;
            }
        }
        else{
            dataValida = false;
        }
        
        
        
        System.out.println("\n\nData é válida: " + dataValida);
    }
}
