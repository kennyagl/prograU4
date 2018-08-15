package unidad4.abstractas;

import unidad4.implementaciones.NodoColaImpl;
import unidad4.interfaces.Cola;
import unidad4.interfaces.nodos.NodoCola;

/**
 *
 * @author Kenny
 */
public abstract class AbstractCola implements Cola {

//    protected NodoCola inicio;
    protected int longitud;

    protected abstract NodoCola getInicio();

    protected abstract void setInicio(NodoCola object);

    @Override
    public void agregar(Object object) {
        if (vacia()) {
            setInicio((NodoCola) object);
            longitud = 1;
        } else {
            NodoCola auxiliar = getInicio();
            for (int i = 1; i < longitud(); i++) {
                auxiliar = auxiliar.getNext();
            }
            auxiliar.setNext((NodoCola) object);
            longitud++;
        }
    }

    @Override
    public int longitud() {
        return this.longitud;
    }

    @Override
    public boolean vacia() {
        return (this.longitud == 0);

    }

    @Override
    public void vaciar() {
        this.longitud = 0;
        setInicio(null);
    }

    @Override
    public Object siguiente() {
        NodoCola auxiliar = getInicio();
        if (auxiliar != null) {
            setInicio(auxiliar.getNext());
        }
        longitud--;
        return auxiliar;
    }
}
