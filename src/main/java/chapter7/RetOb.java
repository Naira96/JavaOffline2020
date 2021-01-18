package chapter7;

public class RetOb {
    public static void main(String[] args) {
        Test ob1 = new Test(2);
        Test ob2;
        ob2 = ob1.incryByTen();
        System.out.println("oЬ1.a: "+ ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incryByTen();
        System.out.println("оb2.а после второго увеличения значения:"
                + ob2.a );
    }

}
