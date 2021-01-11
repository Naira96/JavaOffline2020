package homework.figurePainter;

public class FigurePainter {
    public static void main(String[] args) {

/**
 * 1.Գրել կոդ, որը կպատկերի այս եռանկյունը։
 *      *
 *      * *
 *      * * *
 *      * * * *
 * */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        // 2.* Գրել կոդ, որը կպատկերի այս եռանկյունը։
// *
// *              *
// *            * *
// *          * * *
// *        * * * *
// *

        for (int i = 0; i < 5; i++) {
            for (int k = 5; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

//  *3. Գրել կոդ, որը կպատկերի այս եռանկյունը։
//          *
//          *       * * * *
//          *       * * *
//          *       * *
//          *       *
//
//
        for (int i = 5; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();



////4.  Գրել կոդ, որը կպատկերի այս եռանկյունը։
//                 ****
//                  ***
//                   **
//                    *

        for (int i = 4; i > 0; i--) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

//5. Գրել կոդ, որը կպատկերի այս եռանկյունը։
//            *
//           * *
//          * * *
//         * * * *
//          * * *
//           * *
//            *

        for (int i = 1; i < 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 1; i < 5; i++) {
            for (int j = 3; j <= i + 4; j++) {
                System.out.print(" ");
            }
            for (int k = 7; k >= i + 4; k--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
