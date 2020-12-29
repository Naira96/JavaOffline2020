package educationCenter.storage;

import educationCenter.model.Lesson;
import educationCenter.model.Student;

public class StudentStorage {
    private Student[] students = new Student[20];
    private int size = 0;

    public void add(Student student) {
        if (size == students.length) {
            extend();
        }
        students[size++] = student;
    }

    private void extend() {
        Student[] temp = new Student[students.length + 10];
        for (int i = 0; i < size; i++) {
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
    }


    public Student getLessonByName(String name) {
        for (int i = 0; i < size; i++) {
            if (students[i].getName().equals(name)) {
                return students[i];
            }
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    public void searchStudentByNameOrSurname(String nameOrSurname) {
        for (int i = 0; i < size; i++) {
            if (students[i].getName().contains(nameOrSurname) || students[i].getSurname().contains(nameOrSurname)) {
                System.out.println(students[i]);
            }
        }

    }



//    public void searchStudentByLessonName(String lessonName) {
//        for (int i = 0; i < size; i++) {
//            if (students[i].getLesson().getName().equals(lessonName)) {
//                System.out.println(students[i]);
//            } else {
//                System.out.println("there is not student");
//            }
//        }
//    }


    public void searchByLesson(Lesson byName) {
        for (int i = 0; i < size; i++) {
            if (students[i].getLesson().equals(byName)){
                System.out.println(students[i]);
            }
        }
    }

    public Student getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)){
                return students[i];
            }
            
        }return null;
    }
}


