package library;

import java.util.ArrayList;
import java.util.List;

public class AuthorDataAccess implements DataAccess<Author>{
    private List<Author> authors = new ArrayList<>();

    public List<Author> getAuthors() {
        return authors;
    }

    @Override
    public void add(Author author) {
        authors.add(author);
    }

    @Override
    public void delete(Author author) {
        authors.remove(author);
    }
}
