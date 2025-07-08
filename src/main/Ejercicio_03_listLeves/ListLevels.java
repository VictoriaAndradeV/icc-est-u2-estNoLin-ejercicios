// src/main/java/main/Ejercicio_03_listLeves/ListLevels.java
package main.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Materia.Models.Node;

/**
 * Dado un árbol binario, devuelve una lista de listas enlazadas,
 * donde cada lista contiene los nodos de un nivel del árbol.
 */
public class ListLevels {

    /**
     * Recorre el árbol por niveles (BFS) y agrupa los nodos de cada nivel
     * en una LinkedList.
     *
     * @param root La raíz del árbol.
     * @return Una List que contiene N LinkedList<Node>, siendo N el número de niveles.
     */
    public List<LinkedList<Node>> listByLevel(Node root) {
        List<LinkedList<Node>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            LinkedList<Node> currentLevel = new LinkedList<>();

            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                currentLevel.add(node);
                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
}
