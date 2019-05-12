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
        if (root == null) {
            // puste drzewo
            return null;
        }
        // jesli korzen nie ma prawego syna to zwroc wartosc z korzenia
        // w przeciwnym wpyadku wywolaj rekurencyjnie funkcję ponizej
        if (root.getRight() == null) {
            // korzen nie ma prawego poddrzewa - czyli jest najwiekszym elementem
            return root.getData();
            // ??
        } else {
            // prawe poddrzewo istnieje, wiec musimy zejsc poziom nizej w drzewie
            // ?
            return getMax(root.getRight());
        }

    }

    private T getMax(Node<T> node) {
        if (node.getRight() == null) {
            // nie ma juz wiekszego elementu
            return node.getData();
        }
        return getMax(node.getRight());
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
        if (root != null) {
            inorderTraversal(root);
        }
    }

    private void inorderTraversal(Node<T> node) {
        // odwiedz lewego syna
        if (node.getLeft() != null) {
            inorderTraversal(node.getLeft());
        }

        // wypisz wartosc wezla
        System.out.print(node.getData() + " ");

        // odwiedz prawego syna
        if (node.getRight() != null) {
            inorderTraversal(node.getRight());
        }

    }

    private void preorderTraversal(Node<T> element) {
        // odwiedz element
        System.out.print(element.getData() + " ");

        // odwiedz lewe poddrzewo
        if (element.getLeft() != null) {
            preorderTraversal(element.getLeft());
        }

        // odwiedz prawe poddrzewo

        if (element.getRight() != null) {
            preorderTraversal(element.getRight());
        }
    }


}
