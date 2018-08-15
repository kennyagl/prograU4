package unidad4.interfaces;

/**
 *
 * @author Kenny
 */
public interface Cola extends EstructuraDinamica {

    /**
     * metodo para vaciar la cola
     */
    void vaciar();

    /**
     * metodo que devuelve el siguiente elemento en cola
     *
     * @return el elemento que está al inicio de la cola
     */
    Object siguiente();

}
