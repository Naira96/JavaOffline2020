package chapter10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Перехват исключений общего класса Exception.");
            // Этот оператор catch вообще не будет достигнут,
            //так как подкласс ArithmeticException является
            // производным от класса Exception.
//        }catch (ArithmeticException e){
//            //OSHIBKA:
//            System.out.println("Etot kod voobshe nedostijim");
//        }
        }
    }
}
