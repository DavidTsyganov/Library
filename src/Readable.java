public class Readable {
    private int id;
    private String title;
    private Author author;
    private short numberOfPages;
    private short yearOfRelease;

    Readable(int id, String title) {
        this.id = id;
        this.title = title;
    }


    Readable (int id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    Readable (int id, String title, Author author, short number, short year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.numberOfPages = number;
        this.yearOfRelease = year;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public short getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(short numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public short getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(short yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getId() {
        return this.id;
    }
}
