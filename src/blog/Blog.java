package blog;

import blog.model.Post;
import blog.postStorage.CommandsBlog;
import blog.postStorage.PostStorageImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Blog implements CommandsBlog {
    static PostStorageImpl postStorageImpl = new PostStorageImpl();
    static Scanner scanner = new Scanner(System.in);
    static Date date = new Date();


    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            showCommand();
            String command = scanner.nextLine();

            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_POST:
                    addPost();
                    break;
                case GET_POST_BY_TITLE:
                    getPostByTitle();
                    break;
                case SEARCH_POST:
                    searchPost();
                    break;
                case POSTS_BY_CATEGORY:
                    postByCategory();
                    break;
                case ALL_POSTS:
                    printPost();
                    break;
                default:
                    System.out.println("Wrong command !!!");
                    break;
            }
        }
    }

    //2
    private static void getPostByTitle() {
        System.out.println("please input title");
        String postByTitle = scanner.nextLine();
        try {
            Post post = postStorageImpl.getPostByTitle(postByTitle);
            System.out.println(post);
        } catch (PostNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    //5
    private static void printPost() {
        if (postStorageImpl.isEmpty()) {
            System.out.println("Blog is empty");
        } else {
            postStorageImpl.printAllPosts();
        }
    }

    //4
    private static void postByCategory() {
        System.out.println("please input category");
        String category = scanner.nextLine();
        postStorageImpl.printPostsByCategory(category);
    }

    //3
    private static void searchPost() {
        System.out.println("Please input title for search");
        String keyword = scanner.nextLine();
        postStorageImpl.searchPostsByKeyword(keyword);

    }

    //1
    private static void addPost() {
        System.out.println("Please input title, text, category");
        String title = scanner.nextLine();
        String text = scanner.nextLine();
        String category = scanner.nextLine();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Post post = new Post(title,text,category,date);
        postStorageImpl.add(post);
        System.out.println(post);
        System.out.println("Post was added!");

    }

    //0
    private static void showCommand() {

        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_POST + " for ADD POST");
        System.out.println("Please input " + GET_POST_BY_TITLE + " for GET_POST_BY_TITLE");
        System.out.println("Please input " + SEARCH_POST + " for SEARCH_POST");
        System.out.println("Please input " + POSTS_BY_CATEGORY + " for POSTS_BY_CATEGORY");
        System.out.println("Please input " + ALL_POSTS + " for ALL_POSTS");

    }

}
