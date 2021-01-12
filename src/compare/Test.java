package compare;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        Set<User> users = new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        User user1 = new User("poxos", "poxosyan", Gender.MALE, 22, "3", "pass");
        User user2 = new User("petros", "petrosyan", Gender.MALE, 24, "2", "pass");
        User user3 = new User("apeto", "petrosyan", Gender.MALE, 11, "1", "pass");
//        users.add(user1);
//        users.add(user2);
//        users.add(user3);
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(userList);




    }


}
