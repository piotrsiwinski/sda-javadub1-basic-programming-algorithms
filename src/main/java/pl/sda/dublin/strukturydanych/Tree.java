package pl.sda.dublin.strukturydanych;

public interface Tree<T> {

    void insert(T data);

    void delete(T data);

    T getMax();

    T getMin();

    boolean contains(T data);

    void traversal();
}
