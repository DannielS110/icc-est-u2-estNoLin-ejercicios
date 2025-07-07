package main;

import java.util.List;
import utils.StudentValidator;
import main.Ejercicio_01_insert.InsertBST;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_03_listLeves.ListNode;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());

        
  System.out.println("\n ESTRUCTURAS NO LINEALES - EJERCICIOS ARBOLES ");
        System.out.println("===================================================");
        
        ejecutarEjercicio01();
        ejecutarEjercicio02();
        ejecutarEjercicio03();
        ejecutarEjercicio04();
        
        System.out.println("\nTodos los ejercicios completados exitosamente!");
    }
    
    private static void ejecutarEjercicio01() {
        System.out.println("\n EJERCICIO 01: INSERTAR EN BST");
        System.out.println("Input: [5, 3, 7, 2, 4, 6, 8]");
        
        InsertBST insercionBST = new InsertBST();
        Node raiz = null;
        
        int[] valores = {5, 3, 7, 2, 4, 6, 8};
        for (int valor : valores) {
            raiz = insercionBST.insert(raiz, valor);
        }
        
        System.out.println("Output: BST creado correctamente");
        imprimirArbol(raiz);
    }
    
    private static void ejecutarEjercicio02() {
        System.out.println("\n EJERCICIO 02: INVERTIR ARBOL BINARIO");
        
        InvertBinaryTree inversor = new InvertBinaryTree();
        Node raiz = crearArbolEjemplo();
        
        System.out.println("Arbol original:");
        imprimirArbol(raiz);
        
        Node raizInvertida = inversor.invertTree(raiz);
        System.out.println("\nArbol invertido:");
        imprimirArbol(raizInvertida);
    }
    
    private static void ejecutarEjercicio03() {
        System.out.println("\n EJERCICIO 03: LISTAR NIVELES EN LISTAS ENLAZADAS");
        
        ListLevels listaNiveles = new ListLevels();
        Node raiz = crearArbolEjemplo();
        
        System.out.println("Arbol de entrada:");
        imprimirArbol(raiz);
        
        List<ListNode> listasNiveles = listaNiveles.listLevels(raiz);
        
        System.out.println("\nOutput - Listas enlazadas por nivel:");
        for (int i = 0; i < listasNiveles.size(); i++) {
            System.out.println("Nivel " + i + ": " + imprimirLista(listasNiveles.get(i)));
        }
    }
    
    private static void ejecutarEjercicio04() {
        System.out.println("\n EJERCICIO 04: CALCULAR PROFUNDIDAD MAXIMA");
        
        Depth calculadorProfundidad = new Depth();
        Node raiz = crearArbolEjemploProfundidad();
        
        System.out.println("Arbol de entrada:");
        imprimirArbol(raiz);
        
        int profundidadMaxima = calculadorProfundidad.maxDepth(raiz);
        System.out.println("\nProfundidad mAxima: " + profundidadMaxima);
    }
    
    private static Node crearArbolEjemplo() {
        Node raiz = new Node(4);
        raiz.setLeft(new Node(2));
        raiz.setRight(new Node(7));
        raiz.getLeft().setLeft(new Node(1));
        raiz.getLeft().setRight(new Node(3));
        raiz.getRight().setLeft(new Node(6));
        raiz.getRight().setRight(new Node(9));
        return raiz;
    }
    
    private static Node crearArbolEjemploProfundidad() {
        Node raiz = new Node(4);
        raiz.setLeft(new Node(2));
        raiz.setRight(new Node(7));
        raiz.getLeft().setLeft(new Node(1));
        raiz.getLeft().setRight(new Node(3));
        raiz.getLeft().getLeft().setLeft(new Node(8));
        return raiz;
    }
    
    private static void imprimirArbol(Node raiz) {
        if (raiz == null) {
            System.out.println("Arbol vacío");
            return;
        }
        imprimirArbolHelper(raiz, "", true);
    }
    
    private static void imprimirArbolHelper(Node nodo, String prefijo, boolean esUltimo) {
        if (nodo != null) {
            System.out.println(prefijo + (esUltimo ? "└── " : "├── ") + nodo.getValue());
            
            if (nodo.getLeft() != null || nodo.getRight() != null) {
                if (nodo.getLeft() != null) {
                    imprimirArbolHelper(nodo.getLeft(), prefijo + (esUltimo ? "    " : "│   "), nodo.getRight() == null);
                }
                if (nodo.getRight() != null) {
                    imprimirArbolHelper(nodo.getRight(), prefijo + (esUltimo ? "    " : "│   "), true);
                }
            }
        }
    }
    
    private static String imprimirLista(ListNode cabeza) {
        StringBuilder sb = new StringBuilder();
        ListNode actual = cabeza;
        while (actual != null) {
            sb.append(actual.getVal());
            if (actual.getNext() != null) {
                sb.append(" -> ");
            }
            actual = actual.getNext();
        }
        return sb.toString();
    }
}
