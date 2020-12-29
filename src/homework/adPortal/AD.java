package homework.adPortal;

import java.util.Date;
import java.util.Objects;

public class AD {
    //AD կլասսը պետք է ունենա։ title,text,price,date,category,author(User օբյեկտ պահեք)
    private String title;
    private String text;
    private double price;
    private Date date;
    private String category;
    private User author;


    public AD(String title, String text, double price, Date date, String category, User author) {
        this.title = title;
        this.text = text;
        this.price = price;
        this.date = date;
        this.category = category;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "AD{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", price=" + price +
                ", date=" + date +
                ", category='" + category + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AD ad = (AD) o;
        return Double.compare(ad.price, price) == 0 &&
                Objects.equals(title, ad.title) &&
                Objects.equals(text, ad.text) &&
                Objects.equals(date, ad.date) &&
                Objects.equals(category, ad.category) &&
                Objects.equals(author, ad.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, text, price, date, category, author);
    }
}
