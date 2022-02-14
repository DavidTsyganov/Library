package library;

import java.util.ArrayList;
import java.util.List;

public class BookDataAccess implements DataAccess<Book>{
    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public void add(Book book) {
        books.add(book);
    }

    @Override
    public void delete(Book book) {
        books.remove(book);
    }
}
