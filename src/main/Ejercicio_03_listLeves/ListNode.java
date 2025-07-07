package main.Ejercicio_03_listLeves;

public class ListNode {
    private int valor;
    private ListNode siguiente;
    
    public ListNode(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }
    
    public int getVal() {
        return valor;
    }
    
    public void setVal(int valor) {
        this.valor = valor;
    }
    
    public ListNode getNext() {
        return siguiente;
    }
    
    public void setNext(ListNode siguiente) {
        this.siguiente = siguiente;
    }
}