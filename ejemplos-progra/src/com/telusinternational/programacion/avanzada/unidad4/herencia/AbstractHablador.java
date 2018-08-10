
package com.telusinternational.programacion.avanzada.unidad4.herencia;

/**
 *
 * @author Kenny
 */
public abstract class AbstractHablador implements CantanteInterface {
    
    @Override
    public void cantar() {
        System.out.println("LALALA..");
    }
    
    abstract void decirMiNombre();
    abstract void decirProfesion();
    abstract void decirFechaNacimiento();
    
    
    public void hablar(){
        System.out.println("HOLA");
        decirMiNombre();
        decirProfesion();
        decirFechaNacimiento();
    }
    
    
}
