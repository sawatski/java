package lab3;

import java.io.*;
import java.util.ArrayList;

public class LibraryController {
    private final LibraryModel model;
    private final LibraryView view;

    public LibraryController(LibraryModel model, LibraryView view) {
        this.model = model;
        this.view = view;
    }

    public void addBook(Book book) {
        model.addBook(book);
    }

    public void getBooksByAuthor(String author) {
        Book[] books = model.getBooksByAuthor(author);
        view.printBooksByAuthor(books);
    }

    public void getBooksByPublisher(String publisher) {
        Book[] books = model.getBooksByPublisher(publisher);
        view.printBooksByPublisher(books);
    }

    public void getLatestBooks(int publishingYear) {
        Book[] books = model.getLatestBooks(publishingYear);
        view.printLatestBook(books, publishingYear);
    }

    public void sortBooksByPublisher() {
        Book[] books = model.sortByPublisher();
        view.printBooksInfo(books);
    }

    public void printAllBooks() {
        Book[] books = model.getBooks();
        view.printBooksInfo(books);
    }

        public void writeAllBooksInFile(String filePath) {
            try (ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream(filePath))) {
                Book[] books = model.getBooks();
                oos.writeObject(books);
            } catch(IOException e) {
                e.printStackTrace();
            }
        }



    public void readBooksFromFile(String filePath) {
        ArrayList<Book> books = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(filePath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Book book;
            while (fis.available() > 0) {
                book = (Book)ois.readObject();
                books.add(book);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        view.printBooksInfo(books.toArray(new Book[0]));
    }


}
