package chapter8Extends;

public class B extends A{
    int k;
    void showk(){
        System.out.println("k:" + k);
    }
    void sum(){ System.out.println("i+j+k" + (i+j+k));
    }
    void callme(){
        System.out.println("B методе callme() из класса В");

    }
}
