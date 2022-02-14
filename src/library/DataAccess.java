package library;

import java.util.ArrayList;
import java.util.List;

public interface DataAccess<T> {
    void add(T t);
    void delete(T t);
}
