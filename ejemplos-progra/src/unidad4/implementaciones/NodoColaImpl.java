package unidad4.implementaciones;

import unidad4.interfaces.nodos.NodoCola;

/**
 *
 * @author Kenny
 */
public class NodoColaImpl implements NodoCola{

    private String data;
    private NodoColaImpl next;

    @Override
    public void setNext(NodoCola object) {
        this.next = (NodoColaImpl) object;
    }

    @Override
    public NodoCola getNext() {
        return this.next;
    }


}
