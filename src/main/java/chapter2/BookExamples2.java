package chapter2;

public class BookExamples2 {
    public static void main(String[] args) {
        int num = 100;
        System.out.println("Этo переменная num: " + num);
        num = num * 2;
        System.out.print("Знaчeниe переменной num * 2 равно ");
        System.out.println(num);

        System.out.println();

//class IfSample
        int x, y;
        x = 10;
        y = 20;
        if (x < y) {
            System.out.println("x меньше у");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("x теперь равно у");
        }
        x = x * 2;
        if (x > y) {
            System.out.println("x теперь больше у");
        }

        System.out.println();

        //class ForTest
        int z;
        for(z=0; z<10; z =z+1){
            System.out.println ("Знaчeниe х: " + z);
        }
        System.out.println();

        //class BlockTest
        int k , l;
        l = 20;
        for(k = 0; k <10; k++){
            System.out.println("Знaчeниe k:" + k);
            System.out.println("Знaчeниe l:" + l);
            l = l -2;
        }
        System.out.println();



    }
}
