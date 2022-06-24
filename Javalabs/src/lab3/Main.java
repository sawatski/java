package lab3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        /*ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Голод", "Кнут Гамсун", "Canongate Books", 1890, 200, 190.3));
        books.add(new Book("Сто років самотності", "Габріель Гарсіа Маркес", "Sudamericana", 1967, 350, 490.4));
        books.add(new Book("Кохання під час холери", "Габріель Гарсіа Маркес", "Editorial Oveja Negra", 1985, 480, 796.2));
        */
        String[] titles = new String[] {"Голод", "Сто років самотності", "Кохання під час холери", "Фауст",
                "Мертві душі", "Злочин і кара", "Біси", "Брати Карамазови",
                "Замок", "Процес", "Чарівна гора"};
        String[] authors = new String[] {"Кнут Гамсун", "Габріель Гарсіа Маркес", "Габріель Гарсіа Маркес", "Гете",
                "Микола Гоголь", "Федір Достоєвський", "Федір Достоєвський", "Федір Достоєвський",
                "Франц Кафка", "Франц Кафка", "Томас Манн"};
        String[] publishers = new String[] {"Canongate Books", "Sudamericana", "Editorial Oveja Negra", "Sudamericana",
                "Canongate", "Російський вісник", "Російський вісник", "Російський вісник",
                "Verlag Die Schmiede", "Verlag Die Schmiede", "С. Фішер"};
        int[] publishingYears = new int[] {1890, 1967, 1985, 1832, 1842, 1866, 1872, 1880, 1925, 1926, 1924};
        int[] pages = new int[] {243, 534, 642, 863, 239, 673, 234, 742, 275, 248, 920};
        double[] prices = new double[] {234, 452.6, 234.7, 456.5 ,867.2, 843.023, 7834.3, 834, 910, 621, 823.06};

        LibraryModel model = new LibraryModel();
        LibraryView view = new LibraryView();
        LibraryController controller = new LibraryController(model, view);

        for (int i = 0; i < titles.length; i++) {
            Book book = new Book(titles[i], authors[i], publishers[i], publishingYears[i], pages[i], prices[i]);
            controller.addBook(book);
        }

        controller.printAllBooks();
        controller.sortBooksByPublisher();
        controller.printAllBooks();

        controller.getBooksByAuthor(authors[2]);
        controller.getBooksByPublisher(publishers[1]);
        controller.getLatestBooks(1890);

        controller.getBooksByAuthor("");
        controller.getBooksByPublisher("A");
        controller.getLatestBooks(2890);

        controller.writeAllBooksInFile("src/lab3/books.txt");
        controller.readBooksFromFile("src/lab3/books.txt");
    }
}
