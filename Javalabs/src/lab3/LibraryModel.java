package lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class LibraryModel {
    private final ArrayList<Book> list = new ArrayList<>();

    public LibraryModel() {
    }

    public void addBook(Book book) {
        list.add(book);
    }

    public Book[] getBooks() {
        return list.toArray(new Book[0]);
    }

    public Book[] getBooksByAuthor(String author) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book: list
             ) {
            if(book.getAuthor().equals(author)) result.add(book);
        }
        return result.toArray(new Book[0]);
    }

    public Book[] getBooksByPublisher(String publisher) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book: list
        ) {
            if(book.getPublisher().equals(publisher)) result.add(book);
        }
        return result.toArray(new Book[0]);
    }

    public Book[] getLatestBooks(int publishingYear) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book: list
        ) {
            if(book.getPublishingYear() > publishingYear) result.add(book);
        }
        return result.toArray(new Book[0]);
    }

    public Book[] sortByPublisher() {
        Book[] result = list.toArray(new Book[0]);
        Arrays.sort(result, Comparator.comparing(Book::getPublisher));
        return result;
    }
}
