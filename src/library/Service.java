package library;

public class Service {
    private static AuthorDataAccess authors = new AuthorDataAccess();
    private static BookDataAccess books = new BookDataAccess();

    public static void showAllAuthors() {
        for (Author author : authors.getAuthors()) {
            System.out.println(author);
        }
    }

    public static void showAllBooks() {
        for (Book book : books.getBooks()) {
            System.out.println(book);
        }
    }

    public static AuthorDataAccess getAuthors() {
        return authors;
    }

    public static void setAuthors(AuthorDataAccess authors) {
        Service.authors = authors;
    }

    public static BookDataAccess getBooks() {
        return books;
    }

    public static void setBooks(BookDataAccess books) {
        Service.books = books;
    }
}
