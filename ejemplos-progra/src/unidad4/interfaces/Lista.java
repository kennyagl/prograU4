package unidad4.interfaces;

/**
 *
 * @author Kenny
 */
public interface Lista extends EstructuraDinamica {

    void eliminar(int posicion);

    int posicion(Object object);
    
    void recorrer();
}
