package ioExamples.fileExample.fileExample.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class SerializationDemo {
    private static final String FILE_PATH = "C:\\Users\\User\\JavaOffline2020\\src\\ioExamples\\fileExample\\fileExample\\serialization\\example.txt";

    public static void main(String[] args) throws FileNotFoundException {
        ///printStudentFromFile();
//        for writing student object to file.

        Student student = new Student("poxos", "poxosyan", 36, "poxos@gmail.com");
//        ObjectOutputStream objectOutputStream =
//                new ObjectOutputStream(new FileOutputStream(FILE_PATH));

//        objectOutputStream.writeObject(student);
//        objectOutputStream.close();

//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
//        Object object = objectInputStream.readObject();
//        if (object instanceof Student) {
//            Student student = (Student) object;
//            System.out.println(student);
//            System.out.println(student.getEmail());
//        }

//        Student student1 = new Student("volod", "volod", 22, "volod@gmail.com");
//        List<Student> students = new ArrayList<>();
//        students.add(student);
//        students.add(student1);
//
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
//
//        objectOutputStream.writeObject(students);
//        objectOutputStream.close();


//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
//        Object deserialization = objectInputStream.readObject();
////        Student student1 = (Student) deserialization;
////        System.out.println(student1);
//        List<Student> st = (List<Student>) deserialization;
//        objectInputStream.close();
//        for (Student student2 : st) {
//            System.out.println(student2);
//        }

    }

    public static void printStudentFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
        Object object = objectInputStream.readObject();
        if (object instanceof Student) {
            Student student = (Student) object;
            System.out.println(student);
        }
    }
}

