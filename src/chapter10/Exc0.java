package chapter10;

public class Exc0 {

    static void subroutine(){
        int d = 0;
        int a = 10/ d;
    }
    public static void main(String[] args) {

        Exc0.subroutine();
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
//        int d = 0;
//        int a = 42 / d;


    }
}
