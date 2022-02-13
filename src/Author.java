import java.util.ArrayList;
import java.util.List;

public class Author {
    private int id;
    private String name;

    static List<Author> listOfAuthors = new ArrayList<>();

    Author() {
        this.id = -1;
        this.name = null;
        listOfAuthors.add(this);
    }

    Author(String name) {
        this.name = name;
        listOfAuthors.add(this);
    }

    public void printInfo() {
        System.out.println("Имя и фамилия автора: " + this.name);
    }

    public static void printAllAuthors() {
        for (Author i : listOfAuthors) {
            System.out.println(i.getName());
        }
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
