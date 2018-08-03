package com.telusinternational.programacion.avanzada.unidad4.acuerdos;

import java.util.Date;

/**
 *
 * @author Kenny
 */
public class Categoria {

    String nombre;
    String descripcion;
    Date fechaRegistrado;

    public Categoria() {

    }

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.descripcion = null;
    }

    public Categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
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

    public Date getFechaRegistrado() {
        return fechaRegistrado;
    }

    public void setFechaRegistrado(Date fechaRegistrado) {
        this.fechaRegistrado = fechaRegistrado;
    }
    
    

}
