package lab3;

public class LibraryView {
    public void printBooksByAuthor(Book[] books) {
        if (books.length == 0) {
            System.out.println("Книг даного автора не знайдено\n");
            return;
        }
        printBooksInfo(books);
    }

    public void printBooksByPublisher(Book[] books) {
        if (books.length == 0) {
            System.out.println("Книг даного видавництва не знайдено\n");
            return;
        }
        printBooksInfo(books);
    }

    public void printLatestBook(Book[] books, int year) {
       if (books.length == 0) {
           System.out.println("Книг, які були видані пізніше " + year + "р., не знайдено\n");
           return;
       }
       printBooksInfo(books);
    }

    public void printBooksInfo(Book[] books) {
        for (Book book:
                books) {
            System.out.println(book.toString());
        }
        System.out.println("");
    }
}
