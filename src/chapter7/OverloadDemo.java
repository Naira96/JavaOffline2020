package chapter7;
//peregruzka
public class OverloadDemo {
    void test() {
        System.out.println("Пapaмeтpы отсутствуют");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    double test(double a) {
        System.out.println("douЫe а: " + a);
        return a * a;
    }
}
