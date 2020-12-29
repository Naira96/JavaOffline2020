package chapter8Extends;

import chapter8Extends.dynamicArray.DynamicArrayForStudents;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        //Student student = new Student("Poxos", "Poxosyan", 33);
//        student.setName("Poxos");
//        student.setSurname("Poxosyan");
//        student.setAge(33);
        // System.out.println(student.toString());
        // System.out.println(student);

        Scanner scanner = new Scanner(System.in);
        DynamicArrayForStudents dataStorage = new DynamicArrayForStudents();
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add student");
            System.out.println("Please input 2 for print student");
            System.out.println("Please input 3 for search by name");
            String command = scanner.nextLine();

            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input name, surname, age");
                    String name = scanner.nextLine();
                    String surname = scanner.nextLine();
                    int age = Integer.parseInt(scanner.nextLine());

                    Student student = new Student(name, surname, age);
                    dataStorage.add(student);
                    break;
                case "2":
                    dataStorage.print();
                    break;
                case "3":
                    System.out.println("Please input name");
                    String studentName = scanner.nextLine();
                    dataStorage.searchByName(studentName);
                    break;
                default:
                    System.out.println("wrong command!!!");
            }
        }


//        System.out.println("please input count of Students");
//        int count = Integer.parseInt(scanner.nextLine());
//        Student [] students = new Student[count];
//        for (int i = 0; i < count; i++) {
//
//            System.out.println("Please input name, surname, age");
//            String name = scanner.nextLine();
//            String surname = scanner.nextLine();
//             int age = Integer.parseInt(scanner.nextLine());
//
//            Student student = new Student(name,surname,age);
//
//            students[i] = student;
//        }
//
//        for (Student student : students) {
//            System.out.println(student);
//
//        }

//        System.out.println(name);
//        System.out.println(surname);
//        System.out.println(age);

    }
}
