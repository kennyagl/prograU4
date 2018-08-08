
package com.telusinternational.programacion.avanzada.unidad4.acuerdos;

/**
 *
 * @author Kenny
 */
public class Articulo {
    private Integer numero;
    private String nombre;
    private String descripcion;
    /**
     * VIGENTE
     * DEROGADO
     */
    private String estado;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
