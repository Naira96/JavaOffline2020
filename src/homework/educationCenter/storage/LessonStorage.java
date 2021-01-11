package homework.educationCenter.storage;

import homework.educationCenter.exception.LessonNotFoundException;
import homework.educationCenter.model.Lesson;

public class LessonStorage {
    private Lesson[] lessons = new Lesson[20];
    private int size = 0;

    public void add(Lesson lesson) {
        if (size == lessons.length) {
            extend();
        }
        lessons[size++] = lesson;
    }

    private void extend() {
        Lesson[] temp = new Lesson[lessons.length + 10];
        for (int i = 0; i < size; i++) {
            System.arraycopy(lessons, 0, temp, 0, lessons.length);
            lessons = temp;
        }
    }


    public Lesson getLessonByName(String name) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(name)) {
                return lessons[i];
            }
        }
        return null;
    }
//equalsIgnoreCase - hashvi chi arni mecatarn u poqratar@
    public Lesson getByName(String name) throws LessonNotFoundException {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equalsIgnoreCase(name)) {
                return lessons[i];
            }
        }
        throw new LessonNotFoundException("Lesson with name" + name + " does not exists");

    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i]);
        }
    }

    public void printNames() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i].getName());
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }


//    public Lesson searchLessonByName(String name){
//        for (int i = 0; i < size; i++) {
//            if (lessons[i].getName().contains(name)){
//                return lessons[i];
//            }
//        } return null;
//    }

    public void searchByName(String lessonName) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().contains(lessonName)){
                System.out.println(lessons[i]);
            }

        }
    }
}

