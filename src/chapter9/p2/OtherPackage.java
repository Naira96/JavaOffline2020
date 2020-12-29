package chapter9.p2;

import chapter9.p1.Protection;

public class OtherPackage {
    OtherPackage(){
        Protection p = new Protection();
        System.out.println("konstruktor iz drugogo paketa");
        System.out.println("n_pub = " + p.n_pub);
    }



}
