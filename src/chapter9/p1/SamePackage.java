package chapter9.p1;

public class SamePackage {

    SamePackage(){
        Protection p = new Derived();
        System.out.println("конструктор из того же самого пакета");
        System.out.println("n = " + p.n);
//System.out.println("n_pri "+ p.n_pri);

        System. out .println ( "n_pro = " + p.n_pro);
        System. out .println ( "n_pub = " + p.n_pub);


    }
}
