package main.Ejercicio_01_insert;
import main.Materia.Models.Node;

public class InsertarBST {
     private Node root;

    /** Inserta un valor en el BST */
    public void insert(int value) {
        root = insertRec(root, value);
    }

    /** Método recursivo que inserta y retorna el nuevo subárbol */
    private Node insertRec(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.getValue()) {
            node.setLeft(insertRec(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(insertRec(node.getRight(), value));
        }
        // ignorar duplicados
        return node;
    }

    /** Recorre el árbol en in-order: izq-raíz-der */
    public void printInOrder() {
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(Node node) {
        if (node != null) {
            inOrderRec(node.getLeft());
            System.out.print(node.getValue() + " ");
            inOrderRec(node.getRight());
        }
    }

}
