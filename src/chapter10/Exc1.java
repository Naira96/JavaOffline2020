package chapter10;

public class Exc1 {
    public static void main(String[] args) {
        int d, a;

        try {
            d = 0;
            a = 42/d;
            System.out.println("Это не будет выведено");
        }catch (ArithmeticException e){
            System.out.println("delenie na nuyl");
        }
        System.out.println("posle operatora catch");

    }
}
