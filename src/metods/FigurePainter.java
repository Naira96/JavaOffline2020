package metods;

public class FigurePainter {
    /**
     * 1.Գրել կոդ, որը կպատկերի այս եռանկյունը։
     *      *
     *      * *
     *      * * *
     *      * * * *
     * */
    void figureOne(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    // *
// *              *
// *            * *
// *          * * *
// *        * * * *
// *
    void figureTwo(int a){
        for (int i = 0; i < a; i++) {
            for (int k = 5; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //
//          *       * * * *
//          *       * * *
//          *       * *
//          *       *
//
//
    void figureThree(int a){
        for (int i = 5; i > a; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    //             ****
//                  ***
//                   **
//                    *
void figureFour(int a){
    for (int i = 4; i > a; i--) {
        for (int j = 4; j >= i; j--) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
    //        *
//           * *
//          * * *
//         * * * *
//          * * *
//           * *
//            *
void figureFive (int a){
    for (int i = 1; i < a; i++) {
        for (int j = 5; j >= i; j--) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print(" *");
        }
        System.out.println();
    }
    for (int i = 1; i < a; i++) {
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




