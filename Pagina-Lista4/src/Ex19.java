/*
19) Desafio - Crie um algoritmo que leia uma data (dia, m�s e ano ? n�meros inteiros
separados) e imprima se a data � v�lida ou n�o. Para uma data ser v�lida, o ano deve ser
um n�mero entre 0 e 9999. Al�m disto, deve-se verificar se a quantidade de dias digitadas
� compat�vel com o m�s. N�o esque�a de verificar se o ano � bissexto ou n�o.
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

        System.out.print("\nM�s (0 a 12): \n> ");
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
        
        
        
        System.out.println("\n\nData � v�lida: " + dataValida);
    }
}
