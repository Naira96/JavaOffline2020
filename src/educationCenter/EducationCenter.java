package educationCenter;

import educationCenter.exception.LessonNotFoundException;
import educationCenter.model.Lesson;
import educationCenter.model.Student;
import educationCenter.storage.LessonStorage;
import educationCenter.storage.StudentStorage;

import java.util.Scanner;

public class EducationCenter implements Commands {
    static Scanner scanner = new Scanner(System.in);
    static StudentStorage studentStorage = new StudentStorage();
    static LessonStorage lessonStorage = new LessonStorage();


    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            showCommand();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case PRINT_STUDENTS:
                    System.out.println("print students");
                    studentStorage.print();
                case PRINT_LESSONS:
                    System.out.println("print lessons");
                    lessonStorage.print();
                case SEARCH_STUDENT_BY_NAME_OR_SURNAME:
                    System.out.println("Please input name or surname for search ");
                    String nameOrSurname = scanner.nextLine();
                    studentStorage.searchStudentByNameOrSurname(nameOrSurname);
                    break;
                case SEARCH_LESSON_BY_NAME:
                    System.out.println("please input name");
                    String lessonName = scanner.nextLine();
                    lessonStorage.searchByName(lessonName);
                    break;
                case SEARCH_STUDENTS_BY_LESSON_NAME:
                    searchStudentsByLesson();
                    break;
                case CHANGE_STUDENT_LESSON:
                    changeStudentLesson();
                    break;
                case CHANGE_STUDENT_PHONE:
                    changeStudentPhone();
                    break;
                default:
                    System.out.println("Wrong command!!!");
            }
        }
    }

    //9
    private static void changeStudentPhone() {
        System.out.println("please input email");
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if (student != null) {
            System.out.println("please input new phone");
            String phone = scanner.nextLine();
            student.setPhone(phone);
        } else {
            System.out.println("student's does not exists");
        }
    }

    //8
    private static void changeStudentLesson() {
        System.out.println("please input student's email");
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if (student != null) {
            System.out.println("please choose new Lesson name");
            lessonStorage.printNames();
            String lessonName = scanner.nextLine();
            Lesson lesson = null;
            try {
                lesson = lessonStorage.getByName(lessonName);
                student.setLesson(lesson);
                System.out.println("Student lesson was changed!");
            } catch (LessonNotFoundException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Student does not exists");
        }
    }


    //7
    private static void searchStudentsByLesson() {
        System.out.println("please input lesson name");
        String lessonName = scanner.nextLine();
        Lesson byName = null;
        try {
            byName = lessonStorage.getByName(lessonName);
            studentStorage.searchByLesson(byName);

        } catch (LessonNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }


    public static void showCommand() {
        System.out.println("Please input" + EXIT + "for exit");
        System.out.println("Please input" + ADD_STUDENT + "for ADD STUDENT");
        System.out.println("PLease input" + ADD_LESSON + "for ADD LESSON");
        System.out.println("Please input" + PRINT_STUDENTS + "for PRINT STUDENTS");
        System.out.println("Please input" + PRINT_LESSONS + "for PRINT LESSONS");
        System.out.println("Please input" + SEARCH_STUDENT_BY_NAME_OR_SURNAME + "for SEARCH STUDENT BY NAME OR SURNAME");
        System.out.println("Please input" + SEARCH_LESSON_BY_NAME + "for SEARCH LESSON BY NAME");
        System.out.println("Please input" + SEARCH_STUDENTS_BY_LESSON_NAME + "for SEARCH STUDENTS BY LESSON NAME");
        System.out.println("Please input" + CHANGE_STUDENT_LESSON + " for CHANGE STUDENT LESSON");
        System.out.println("Please input" + CHANGE_STUDENT_PHONE + "for CHANGE STUDENT PHONE");
    }

    //2
    private static void addLesson() {
        System.out.println("Please input name,duration, price, lecturerName");
        String lessonDataStr = scanner.nextLine();
        String[] lessonData = lessonDataStr.split(",");
        try {
            String name = lessonData[0];
            try {
                lessonStorage.getByName(name);
                System.out.println("Lesson with " + name + "already exists. please choose another name");
            } catch (LessonNotFoundException e) {
                int duration = Integer.parseInt(lessonData[1]);
                double price = Double.parseDouble(lessonData[2]);
                String lecturerName = lessonData[3];
                Lesson lesson = new Lesson(name, duration, price, lecturerName);
                lessonStorage.add(lesson);
                System.out.println("Lesson was added");
            }
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("invalid data");
        } catch (NumberFormatException e2) {
            System.out.println("invalid number ");
        }
    }



    //1
    private static void addStudent() {
        if (lessonStorage.isEmpty()) {
            System.out.println("Please add lesson first");
            addLesson();
        } else {
            System.out.println("please select lesson [name] from list");
            lessonStorage.printNames();
            String lessonName = scanner.nextLine();
            Lesson lesson = null;
            try {
                lesson = lessonStorage.getByName(lessonName);
                System.out.println("please input name, surname,phone,email");
                String studentDataStr = scanner.nextLine();
                String[] studentData = studentDataStr.split(",");
                Student student = new Student(studentData[0], studentData[1],
                        studentData[2], studentData[3], lesson);
                studentStorage.add(student);
                System.out.println("student was added");
            } catch (LessonNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("invalid data");
            } catch (NumberFormatException e) {
                System.out.println("invalid number");
            }

        }
    }


}

