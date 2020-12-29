package chapter7;

public class Person {


    public static String country = "Armenia";

    private String name;
    private int age;

//2 konstruktor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public static void meth(){
        System.out.println(country);
        System.out.println("kuku");
    }
//2metod get-vercnelu hamar
    //set@ talu hamar

// ctrl  + insert
    public String getName() {
        System.out.println(country);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
