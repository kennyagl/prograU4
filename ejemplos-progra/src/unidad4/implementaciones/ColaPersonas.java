package unidad4.implementaciones;

import unidad4.abstractas.AbstractCola;
import unidad4.interfaces.nodos.NodoCola;

/**
 *
 * @author Kenny
 */
public class ColaPersonas extends AbstractCola {

    private Persona inicio;

    @Override
    protected NodoCola getInicio() {
        return inicio;
    }

    @Override
    protected void setInicio(NodoCola object) {
        this.inicio = (Persona) object;
    }

    
    
}
