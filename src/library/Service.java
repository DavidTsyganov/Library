package library;

public class Service {
    public static void showAllAuthors(AuthorDataAccess authors) {
        for (Author author : authors.getAuthors()) {
            System.out.println(author);
        }
    }

    public static void showAllBooks(BookDataAccess books) {
        for (Book book : books.getBooks()) {
            System.out.println(book);
        }
    }
}
