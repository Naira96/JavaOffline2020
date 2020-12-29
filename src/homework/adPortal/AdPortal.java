package homework.adPortal;

import java.util.*;


public class AdPortal implements AdPortalCommands {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            showCommands();
            String command = scanner.next();
            switch (command) {
                case EXIT:
                    System.exit(0);
                    break;
                case LOGIN:

                    System.out.println("please input phoneNumber, password");

                    break;
                case REGISTER:
                    System.out.println("please input name,surname,gender,age,phoneNumber, password");
                    Map<String, User> userMap = new HashMap<>();

                    // userMap.put("1111111", new User("Naira","Shukhyan", Gender.FEMALE, 24,"094110696","naira"));
                    String name = scanner.nextLine();
                    String surname = scanner.nextLine();
                    String gender = Gender.FEMALE.name();
                    System.out.println(gender);
                    String age = scanner.nextLine();
                    String phoneNumber = scanner.nextLine();
                    String password = scanner.nextLine();

                    break;
                default:
                    System.out.println("wrong command");
            }
        }


    }

    private static void showCommands() {
        System.out.println("please input" + EXIT + " for exit");
        System.out.println("please input" + LOGIN + " for login");
        System.out.println("please input" + REGISTER + " for Register");
    }


}
