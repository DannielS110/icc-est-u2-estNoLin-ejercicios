package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {
    
    public Node invertTree(Node raiz) {
        if (raiz == null) {
            return null;
        }
        
        Node temp = raiz.getLeft();
        raiz.setLeft(raiz.getRight());
        raiz.setRight(temp);
        
        invertTree(raiz.getLeft());
        invertTree(raiz.getRight());
        
        return raiz;
    }
}