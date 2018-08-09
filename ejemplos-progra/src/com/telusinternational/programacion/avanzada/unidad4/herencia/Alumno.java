package com.telusinternational.programacion.avanzada.unidad4.herencia;

/**
 *
 * @author Kenny
 */
public class Alumno extends HomoSapiens {

    private String identificador;

    /**
     * especializa sobreescribiendo el método super hace referncia a la
     * superclase (HomoSapiens)
     */
    @Override
    public void hablar() {
        super.hablar();
        System.out.println("Soy alumno con identificador " + identificador);
    }
}
