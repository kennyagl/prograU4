
package unidad4.implementaciones;

import unidad4.abstractas.AbstractCola;
import unidad4.interfaces.nodos.NodoCola;

/**
 *
 * @author Kenny
 */
public class ColaEnteros extends AbstractCola {
    NumeroEntero cabeza;
    
    @Override
    protected NodoCola getInicio() {
        return this.cabeza;
    }

    @Override
    protected void setInicio(NodoCola object) {
        
        this.cabeza = (NumeroEntero) object;
    }
    
}
