
package poryecto;


public class NodoDelArbol {
  
    
    private int valorDelNodo;
    private NodoDelArbol nodoIzquierdo;
    private NodoDelArbol nodoDerecho;

    public NodoDelArbol(int valorDelNodo) {
        this.valorDelNodo = valorDelNodo;
        this.nodoDerecho = null;
        this.nodoIzquierdo = null;
    }

    public void setValorDelNodo(int valorDelNodo) {
        this.valorDelNodo = valorDelNodo;
    }

    public int getValorDelNodo() {
        return this.valorDelNodo;
    }

    public void setNodoDerecho(NodoDelArbol derecho) {
        this.nodoDerecho = derecho;
    }

    public NodoDelArbol getNodoDerecho() {
        return this.nodoDerecho;
    }

    public void setNodoIzquierdo(NodoDelArbol izquierdo) {
        this.nodoIzquierdo = izquierdo;
    }

    public NodoDelArbol getNodoIzquierdo() {
        return this.nodoIzquierdo;
    }

}

    
    
    
    

