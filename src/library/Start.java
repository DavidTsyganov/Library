package library;

import java.util.List;

public class Start {

    public static void main(String[] args) {
        Author author1 = new Author(1, "Алексей Марков");
        Author author2 = new Author(2, "Сенека");
        Book book1 = new Book(1, "Жлобология", author1);
        Book book2 = new Book(2, "Нравственные письма к Луцилию", author2);

        Service.getBooks().add(book1);
        Service.getBooks().add(book2);

        Service.getAuthors().add(author1);
        Service.getAuthors().add(author2);

        Service.showAllAuthors();
        Service.showAllBooks();


    }
}
