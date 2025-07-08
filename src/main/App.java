package main;

import java.util.LinkedList;
import java.util.List;
import main.Ejercicio_01_insert.InsertarBST;
import main.Ejercicio_02_invert.ArbolInvertido;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.DepthCalculator;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        /* NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ*/

        //BST
        int[] valores = {5, 3, 7, 2, 4, 6, 8};

        InsertarBST arbol = new InsertarBST();
        for (int v : valores) {
            arbol.insert(v);
        }

        System.out.print("In-order: ");
        arbol.printInOrder(); 

        

        // Invertir el árbol

        ArbolBinario bst = new ArbolBinario();
        for (int v : valores) {
            bst.insert(v);
        }
        System.out.println("Árbol original:");
        bst.printTree();

        ArbolInvertido inverter = new ArbolInvertido();
        // Obtenemos la raíz actual y la invertimos en sitio
        Node invertedRoot = inverter.invert(bst.getRoot());

        System.out.println("\nÁrbol invertido (espejo):");
        // Reutilizamos el método de impresión de ArbolBinario para la nueva raíz
        bst.printTreeNode2(invertedRoot, "", true);

        //tercer ejer
        ListLevels levelLister = new ListLevels();
        List<LinkedList<Node>> niveles = levelLister.listByLevel(invertedRoot);

        System.out.println("\nListas por nivel:");
        for (LinkedList<Node> nivel : niveles) {
            // Imprimir valores separados por " → "
            for (int i = 0; i < nivel.size(); i++) {
                System.out.print(nivel.get(i).getValue());
                if (i < nivel.size() - 1) {
                    System.out.print(" → ");
                }
            }
            System.out.println();
        }

        //ejercicio 4
        Node root4 = new Node(4);
        root4.setLeft(new Node(2));
        root4.setRight(new Node(7));
        root4.getLeft().setLeft(new Node(1));
        root4.getLeft().setRight(new Node(3));
        // el nodo 8 como hijo izquierdo de 1
        root4.getLeft().getLeft().setLeft(new Node(8));

        DepthCalculator dc = new DepthCalculator();
        int profundidad = dc.maxDepth(root4);
        System.out.println("Profundidad máxima del árbol: " + profundidad);
        //Debería imprimir: Profundidad máxima del árbol: 4
    }
}
