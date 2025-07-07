package main.Ejercicio_01_insert;

import main.Materia.Models.Node;

public class InsertBST {
    
    public Node insert(Node raiz, int valor) {
        if (raiz == null) {
            return new Node(valor);
        }
        
        if (valor < raiz.getValue()) {
            raiz.setLeft(insert(raiz.getLeft(), valor));
        } else if (valor > raiz.getValue()) {
            raiz.setRight(insert(raiz.getRight(), valor));
        }
        
        return raiz;
    }
}