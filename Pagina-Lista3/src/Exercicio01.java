/*
1) Apresente os resultados (true ou false) das seguintes expressões:
5 + 3 * 6 / 2 >= 10
36 / 3 * 2 ? 5 +8 == 27
! (30 / 4 * 6 == 15)
(30 % 4 * 6 == 12) || true
(5 * 7 % 3) + 4 / 2 + 5 == 12 && (12 / 4 < 8)
(((5 * 7 % 3 + 5) / 2 + 5) <= 14) II (! (12 / 4 < 8 * 2))
 */
package lista02;

public class Exercicio01 {

    public static void main(String[] args) {

        //a) 5 + 3 * 6 / 2 >= 10
        if ((5 + 3 * 6 / 2) >= 10) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        //b) 36 / 3 * 2 - 5 + 8 == 27
        if ((36 / 3 * 2 - 5 + 8) == 27) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        //c) ! (30 / 4 * 6 == 15)
        if (!(30 / 4 * 6 == 15)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        //d) (30 % 4 * 6 == 12) || true
        if ((30 % 4 * 6) == 12 || true) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        //e) (5 * 7 % 3) + 4 / 2 + 5 == 12 && (12 / 4 < 8)
        if ((5 * 7 % 3) + 4 / 2 + 5 == 12 && (12 / 4 < 8)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        
        //f) (((5 * 7 % 3 + 5) / 2 + 5) <= 14) II (! (12 / 4 < 8 * 2))
        if((((5 * 7 % 3 + 5) / 2 + 5) <= 14) || (! (12 / 4 < 8 * 2))){
          System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
