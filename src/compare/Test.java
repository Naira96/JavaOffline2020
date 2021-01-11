package compare;

import java.util.Set;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {


        Set<User> users = new TreeSet<>();
        User user = new User("Poxos", "Poxosyan", Gender.FEMALE, 22, "11", "poxos");
        User user1 = new User("Petros", "Poxosyan", Gender.FEMALE, 40, "22", "poxos");
        User user2 = new User("Martiros", "Poxosyan", Gender.FEMALE, 10, "33", "poxos");
        User user3 = new User("Pilipos", "Poxosyan", Gender.FEMALE, 99, "444", "poxos");
        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);

        System.out.println(users);



    }


}
