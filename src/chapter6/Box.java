package chapter6;

public class Box {

    double width;
    double height;
    double depth;
    double volume() {
//        System.out.println(" Ծավալը։");
//        System.out.println(width*height*depth);
        return width* height * depth;
    }
void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;

}
}
