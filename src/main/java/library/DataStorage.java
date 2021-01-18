package library;

public class DataStorage {

    private Book[] books = new Book[16];
    private int size = 0;

    public void add(Book value) {
        if (size == books.length) {
            extend();
        }
        books[size++] = value;
    }

    private void extend() {
        Book[] temp = new Book[books.length + 10];
        System.arraycopy(books, 0, temp, 0, books.length);
        books = temp;
    }

    public Book get(int index) {
        return books[index];
    }

    public Book getBookByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }return null;
    }



    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }


}
