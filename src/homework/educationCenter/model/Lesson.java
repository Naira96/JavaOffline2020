package homework.educationCenter.model;

import java.util.Objects;

public class Lesson {
    private String name;
    private int duration;
    private double price;
    private String lecturerName;

    public Lesson() {
    }

    public Lesson(String name, int duration, double price, String lecturerName) {
        this.name = name;
        this.duration = duration;
        this.price = price;
        this.lecturerName = lecturerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return duration == lesson.duration &&
                Double.compare(lesson.price, price) == 0 &&
                Objects.equals(name, lesson.name) &&
                Objects.equals(lecturerName, lesson.lecturerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, duration, price, lecturerName);
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                ", lectureName='" + lecturerName + '\'' +
                '}';
    }
}
