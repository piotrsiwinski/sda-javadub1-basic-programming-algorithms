package pl.sda.dublin.strukturydanych;

// klasa reprezentująca pojedynczy wezel drzewa (wartosc i wskazanie na lewego i prawego syna)
public class Node<T> {
    private T data; // pole danych
    private Node<T> left; // pole wskazujace lewy wezel
    private Node<T> right; // pole wskazujace prawy wezel

    // 3 pola, konstruktor 1 parametrowy przyjmujący pole z danymi
    // gettery i settery dla wszystkich pol

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }
}
