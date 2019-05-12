package pl.sda.dublin.strukturydanych;

public class BinaryTreeProgram {

    public static void main(String[] args) {
        // Utworzyc drzewo binarne <String>
        // wstawic elementy F, B, G, A, D
        // przetestowac dzialanie metode wstawiania elementu
        Tree<String> drzewo = new BinarySearchTree<>();
        drzewo.insert("F");
        System.out.println(drzewo.getMax());
        drzewo.insert("B");
        drzewo.insert("G");
        System.out.println(drzewo.getMax());
        drzewo.insert("A");
        drzewo.insert("D");
        drzewo.insert("I");
        System.out.println(drzewo.getMax());


        System.out.println("Tree traversal");

        drzewo.traversal();

    }
}
