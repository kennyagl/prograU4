package com.telusinternational.programacion.avanzada.unidad4.acuerdos;

/**
 *
 * @author Kenny
 */
public class Persona {

    protected String nombres;
    protected String apellidos;

    public Persona() {
        this.apellidos = null;
        this.nombres = null;
        
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
    
    
    
}
