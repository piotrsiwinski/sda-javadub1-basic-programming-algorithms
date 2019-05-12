package pl.sda.dublin.strukturydanych;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    @Override
    public void insert(T data) {
        if (root == null) {
            // drzewo puste
            root = new Node<>(data);
        } else {
            // mamy korzen w drzewie ===> root != null
            insert(data, root);
        }
    }

    // data - element ktory wstawiamy
    // node - aktualny wezel (na poczatku korzen, potem korzen poddrzewa)
    // compareTo - porownuje wstawiany element z aktualna wartoscia korzenia badz wezla
    private void insert(T nowaWartosc, Node<T> node) {
        // jesli dane mniejsze od aktualnego wezla to wstawiamy w lewe poddrzewo
        // idziemy w lewe poddrzewo
        // pierwszy if obsluguje lewe poddrzewo
        // w pozostalych przypadkach (rowny, badz wiekszy) wstawiamy w prawe poddrzewo
        if (nowaWartosc.compareTo(node.getData()) < 0) {
            if (node.getLeft() == null) {
                // sprawdzamy czy node jest lisciem
                // jesli lisc to wstawiamy w jego lewe poddrzewo
                // nie ma juz lewego poddrzewa - tutaj wstawiamy
                Node<T> newNode = new Node<>(nowaWartosc);
                node.setLeft(newNode);
            } else {
                // wezel nie jest lisciem, czyli rekurencyjnie wywolujemy funkcje insert z lewym wezlem
                insert(nowaWartosc, node.getLeft());
            }
        } else {
            if (node.getRight() == null) {
                Node<T> newNode = new Node<>(nowaWartosc);
                node.setRight(newNode);
            } else {
                insert(nowaWartosc, node.getRight());
            }
        }
    }


    @Override
    public void delete(T data) {

    }

    @Override
    public T getMax() {
        return null;
    }

    @Override
    public T getMin() {
        return null;
    }

    @Override
    public boolean contains(T data) {
        return false;
    }

    @Override
    public void traversal() {

    }
}
