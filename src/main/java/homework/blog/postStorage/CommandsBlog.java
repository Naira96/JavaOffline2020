package homework.blog.postStorage;

public interface CommandsBlog {
    String EXIT = "0";
    String ADD_POST = "1";
    String SEARCH_BY_TITLE = "2";
    String SEARCH_POST = "3";
    String POSTS_BY_CATEGORY = "4";
    String ALL_POSTS = "5";


     static void showCommand() {

        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_POST + " for ADD POST");
        System.out.println("Please input " + SEARCH_BY_TITLE + " for SEARCH_BY_TITLE");
        System.out.println("Please input " + SEARCH_POST + " for SEARCH_POST");
        System.out.println("Please input " + POSTS_BY_CATEGORY + " for POSTS_BY_CATEGORY");
        System.out.println("Please input " + ALL_POSTS + " for ALL_POSTS");

    }
}
