package homework.blog;

import homework.blog.exception.PostNotFoundException;
import homework.blog.model.Category;
import homework.blog.model.Post;
import homework.blog.postStorage.CommandsBlog;
import homework.blog.postStorage.impl.PostStorageImpl;

import java.util.Date;
import java.util.Scanner;

public class Blog implements CommandsBlog {
    private static PostStorageImpl postStorageImpl = new PostStorageImpl();
    private static Scanner scanner = new Scanner(System.in);
    private static Date date = new Date();


    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            CommandsBlog.showCommand();
            String command = scanner.nextLine();

            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_POST:
                    addPost();
                    break;
                case SEARCH_BY_TITLE:
                     searchByTitle();
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


    //5
    private static void printPost() {
        postStorageImpl.printAllPosts();
    }

    //4.
    private static void postByCategory() {
        System.out.println("here is the category list");
        for (Category value : Category.values()) {
            System.out.println(value);
        }
        try {
            String categoryStr = scanner.nextLine();
            postStorageImpl.printPostsByCategory(Category.valueOf(categoryStr));
        }catch (IllegalArgumentException e){
            System.out.println("wrong category");
        }
    }

    //3.
    private static void searchPost() {
        System.out.println("Please input title for search");
        String keyword = scanner.nextLine();
        postStorageImpl.searchPostsByKeyword(keyword);
    }
    //2
    private static void searchByTitle() {
        System.out.println("please input title");
        String postByTitle = scanner.nextLine();
        try {
            Post post = postStorageImpl.getPostByTitle(postByTitle);
            System.out.println(post);
        } catch (PostNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    //1.
    private static void addPost() {
        System.out.println("please input title, text, category");
        System.out.println("Here is the category list");
        for (Category value : Category.values()) {
            System.out.println(value);
        }
        String postData = scanner.nextLine();
        try {
            String[] postDataArr = postData.split(",");
            Post post = new Post(postDataArr[0], postDataArr[1], Category.valueOf(postDataArr[2].toUpperCase()), new Date());
            postStorageImpl.add(post);
            System.out.println("Post was added!!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid data");
            addPost();
        }catch (IllegalArgumentException e ){
            System.out.println(" wrong category");
        }
    }
}
