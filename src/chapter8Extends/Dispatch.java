package chapter8Extends;

public class Dispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r; //получить ссылку на объект типа А

        r = a; //переменная r ссылается на объект типа А
        r.callme(); // вызвать вариант метода callme(),
                     //определенный в классе А

        r = b; //переменная r ссылается на объект типа в
        r.callme(); //вызвать вариант метода callme(),
                     //определенный в классе В

        r = c;  //переменная r ссылается на объект типа С
        c.callme(); //вызвать вариант метода callme(),
                    // определенный в классе С

    }
}
