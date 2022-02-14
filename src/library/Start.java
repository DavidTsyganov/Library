package library;

import java.util.List;

public class Start {
    private static BookDataAccess books = new BookDataAccess();
    private static AuthorDataAccess authors = new AuthorDataAccess();

    public static void main(String[] args) {
        Author author1 = new Author(1, "Алексей Марков");
        Author author2 = new Author(2, "Сенека");
        Book book1 = new Book(1, "Жлобология", author1);
        Book book2 = new Book(2, "Нравственные письма к Луцилию", author2);

        books.add(book1);
        books.add(book2);

        authors.add(author1);
        authors.add(author2);

        Service.showAllAuthors(authors);
        Service.showAllBooks(books);


    }
}
