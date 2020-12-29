package chapter9;

public class Client implements CallBack {
    public void callback(int p){
        System.out.println("metod callback(), " + "vizivaemiy so znacheniem " + p );
    }
void nonIFaceMeth(){
    System.out.println("В классах, реализующих интерфейси," + "могут определяться и другие члены");
}
}
