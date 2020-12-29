package chapter8Extends.library;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DataStorage dataStorage = new DataStorage();
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for ADD BOOK");
            System.out.println("Please input 2 for for SEARCH BOOK BY TITLE");
            String command = scanner.nextLine();

            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Ներմուծեք գրքի տվյալները");
                    System.out.println("Title");
                    String title = scanner.nextLine();
                    System.out.println("authorName");
                    String authorName = scanner.nextLine();

                    System.out.println("price");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.println("count");
                    int count = Integer.parseInt(scanner.nextLine());

                    Book book = new Book(title, authorName, price, count);
                     dataStorage.add(book);
                     break;
                case "2":
                    System.out.println("Please input title for search");
                    String searchTitle = scanner.nextLine();
                    Book searchedBook =dataStorage.getBookByTitle(searchTitle);
                    if (searchedBook == null){
                        System.out.println("Book with" + searchTitle + "title does not exists");
                    }else{
                        System.out.println(searchedBook);
                    }
                default:
                    System.out.println("wrong command!!!");
            }
        }


        // System.out.println(book);


//        Book book1 = new Book();
//        book1.setTitle(title);
//        book1.setAuthorName(authorName);
//        book1.setCount(count);
//        book1.setPrice(price);
//        System.out.println(book1);
    }
}
