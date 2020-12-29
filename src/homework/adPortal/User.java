package homework.adPortal;

import java.util.Objects;

public class User {
    //REGISTER սեղմելուց ուզելու ենք հետևյալ դաշտերը։ name, surname, gender, age, phoneNumber, password.
    private String name;
    private String surname;
    private Gender gender;
    private int age;
    private String phoneNumber;
    private String password;


    public User(String name, String surname, Gender gender, int age, String phoneNumber, String password) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User register = (User) o;
        return age == register.age &&
                Objects.equals(name, register.name) &&
                Objects.equals(surname, register.surname) &&
                Objects.equals(gender, register.gender) &&
                Objects.equals(phoneNumber, register.phoneNumber) &&
                Objects.equals(password, register.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, age, phoneNumber, password);
    }

    @Override
    public String toString() {
        return "Register{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
