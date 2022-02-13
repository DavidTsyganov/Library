import java.util.ArrayList;
import java.util.List;

public class Book extends Readable{
    static List<Book> books = new ArrayList<>();

    Book (int id, String title) {
        super(id, title);
        books.add(this);
    }


    Book (int id, String title, Author author) {
        super(id, title, author);
        books.add(this);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void printInfo() {
        System.out.println("Название книги: " + getTitle());
        System.out.println("Автор книги: " + getAuthor().getName());
        System.out.println("Год выпуска: " + getYearOfRelease());
    }

    public static void printAllBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
}
