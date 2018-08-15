package unidad4.implementaciones;

import unidad4.interfaces.nodos.NodoCola;

/**
 *
 * @author Kenny
 */
public class Persona implements NodoCola {

    private String nombre;
    private String apellido;
    private Persona next;

    @Override
    public void setNext(NodoCola object) {
        this.next = (Persona) object;
    }

    @Override
    public NodoCola getNext() {
        return this.next;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
