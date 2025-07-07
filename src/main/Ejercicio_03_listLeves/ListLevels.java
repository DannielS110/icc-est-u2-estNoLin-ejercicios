package main.Ejercicio_03_listLeves;

import main.Materia.Models.Node;
import java.util.*;

public class ListLevels {
    
    public List<ListNode> listLevels(Node raiz) {
        List<ListNode> resultado = new ArrayList<>();
        
        if (raiz == null) {
            return resultado;
        }
        
        Queue<Node> cola = new LinkedList<>();
        cola.offer(raiz);
        
        while (!cola.isEmpty()) {
            int tamanoNivel = cola.size();
            ListNode cabezaNivel = null;
            ListNode colaNivel = null;
            
            for (int i = 0; i < tamanoNivel; i++) {
                Node nodoActual = cola.poll();
                ListNode nodoLista = new ListNode(nodoActual.getValue());
                
                if (cabezaNivel == null) {
                    cabezaNivel = nodoLista;
                    colaNivel = nodoLista;
                } else {
                    colaNivel.setNext(nodoLista);
                    colaNivel = nodoLista;
                }
                
                if (nodoActual.getLeft() != null) {
                    cola.offer(nodoActual.getLeft());
                }
                if (nodoActual.getRight() != null) {
                    cola.offer(nodoActual.getRight());
                }
            }
            
            resultado.add(cabezaNivel);
        }
        
        return resultado;
    }
}