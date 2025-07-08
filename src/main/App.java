package main;

import main.Ejercicio_01_insert.InsertarBST;
import main.Ejercicio_02_invert.ArbolInvertido;
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

        ArbolBinario bst = new ArbolBinario();
        for (int v : valores) {
            bst.insert(v);
        }

        System.out.println("Árbol original:");
        bst.printTree();

        // --- 2) Invertir el árbol ---
        ArbolInvertido inverter = new ArbolInvertido();
        // Obtenemos la raíz actual y la invertimos en sitio
        Node invertedRoot = inverter.invert(bst.getRoot());

        System.out.println("\nÁrbol invertido (espejo):");
        // Reutilizamos el método de impresión de ArbolBinario para la nueva raíz
        bst.printTreeNode2(invertedRoot, "", true);
    }
}
