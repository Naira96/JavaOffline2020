package homework.adPortal.model;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
public class Ad implements Serializable {

    private String title;
    private String text;
    private double price;
    private Date date;
    private Category category;
    private User user;
}
