
package unidad4.implementaciones;

import unidad4.interfaces.nodos.NodoCola;

/**
 *
 * @author Kenny
 */
public class NumeroEntero implements NodoCola{
    
    Integer valor;
    NumeroEntero next;

    @Override
    public void setNext(NodoCola object) {
        this.next = (NumeroEntero) object;
    }

    @Override
    public NodoCola getNext() {
        return this.next;
    }
    
}
