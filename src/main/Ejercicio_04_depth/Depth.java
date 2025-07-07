package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {
    
    public int maxDepth(Node raiz) {
        if (raiz == null) {
            return 0;
        }
        
        int profundidadIzquierda = maxDepth(raiz.getLeft());
        int profundidadDerecha = maxDepth(raiz.getRight());
        
        return 1 + Math.max(profundidadIzquierda, profundidadDerecha);
    }
}