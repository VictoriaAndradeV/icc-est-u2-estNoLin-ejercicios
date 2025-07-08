// src/main/java/main/Ejercicio_02_invert/ArbolInvertido.java
package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

/**
 * Invierte (espejo) un árbol binario.
 */
public class ArbolInvertido {

    /**
     * Toma la raíz de un árbol binario y lo invierte en sitio.
     * @param node La raíz del árbol (o subárbol) a invertir.
     * @return La nueva raíz del árbol invertido.
     */
    public Node invert(Node node) {
        if (node == null) {
            return null;
        }
        // Invierte recursivamente subárboles
        Node leftInverted  = invert(node.getLeft());
        Node rightInverted = invert(node.getRight());
        // Swapea hijos
        node.setLeft(rightInverted);
        node.setRight(leftInverted);
        return node;
    }
}
