package chapter6;

public class BoxTest {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

//        Box myBox3 = myBox1;

        myBox1.setDim(10,20,15);
        myBox2.setDim(3,6,9);

//        double volume = myBox1.width * myBox1.height * myBox1.depth;
//
//        System.out.println("Ծավալը mybox1: " + volume);
//
//        volume = myBox2.width * myBox2.height * myBox2.depth;
//        System.out.println("Ծավալը mybox2: " + volume);
        double vol = myBox1.volume();
        System.out.println(vol *2);

        double vol2 = myBox2.volume();
        System.out.println(vol2);










    }
}
