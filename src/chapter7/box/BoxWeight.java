package chapter7.box;

import chapter7.box.Box;

public class BoxWeight extends Box {
    double weight;


    BoxWeight(double w, double h, double d, double m) {
//        width = w;
//        height =h;
//        depth = d;
//        weight = m;

        //3tox grelu poxaren karox enq grel
        super(w, h, d);
        weight = m;
    }

    BoxWeight(BoxWeight ob){
        super(ob);
        weight =ob.weight;
    }
    BoxWeight(){
        super();
        weight =-1;
    }
    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }
}