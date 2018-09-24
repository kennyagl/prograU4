package examen;

/**
 *
 * @author Kenny
 */
public class Nodo {

    private Producto data;
    private Nodo next;

    public Nodo() {
    }

    public Nodo(Producto data) {
        this.data = data;
    }

    public Producto getData() {
        return data;
    }

    public void setData(Producto data) {
        this.data = data;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

}
