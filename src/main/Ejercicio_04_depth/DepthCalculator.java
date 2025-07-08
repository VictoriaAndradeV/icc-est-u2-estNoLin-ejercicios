// src/main/java/main/Ejercicio_04_depth/DepthCalculator.java
package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

/**
 * Calcula la profundidad máxima de un árbol binario.
 */
public class DepthCalculator {

    /**
     * Retorna la profundidad máxima (longitud del camino más largo desde la raíz hasta una hoja).
     * @param node La raíz del árbol (o subárbol).
     * @return La profundidad máxima.
     */
    public int maxDepth(Node node) {
        if (node == null) {
            return 0;
        }
        int leftDepth  = maxDepth(node.getLeft());
        int rightDepth = maxDepth(node.getRight());
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
