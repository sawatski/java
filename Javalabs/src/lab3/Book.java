package lab3;

import java.io.Serializable;

public class Book implements Serializable {
    private final String title;
    private final String author;
    private final String publisher;
    private final int publishingYear;
    private final int pages;
    private double price;

    public Book(String title, String author, String publisher, int publishingYear, int pages, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.pages = pages;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishingYear=" + publishingYear +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }
}
