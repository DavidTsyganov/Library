package library;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private int id;
    private String name;


    Author() {
        this.id = -1;
        this.name = null;
    }

    Author(int id, String name) {
        this.name = name;
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
