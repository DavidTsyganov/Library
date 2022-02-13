public class Start {
    public static void main(String[] args) {
        Author alexMarkov = new Author("Алексей Марков");
        Book book1 = new Book(1, "Жлобология", alexMarkov);

        alexMarkov.printInfo();
        book1.printInfo();

        System.out.println();

        Book.printAllBooks();
        Author.printAllAuthors();



    }
}
