package chapter4;

public class OpBitEquals {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        a |= 4;
        b >>= 1;
        c <<= 1;
        a ^= c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
//       int a = 4;
//       int b = 1;
//       boolean c = a < b;
////        if ( !done) ... //Допустимо в С/С++,
////            if(done) ... но не в Java.
////
////        if (done == 0) ... // Это стиль Java
////        if(done != 0)
    }
}
