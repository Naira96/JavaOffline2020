package homework.adPortal.model;

import lombok.*;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User implements Serializable   {

    private String name;
    private String surname;
    private Gender gender;
    private int age;
    private String phoneNumber;
    private String password;
}
