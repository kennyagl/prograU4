package com.telusinternational.programacion.avanzada.unidad4.herencia;

/**
 *
 * @author Kenny
 */
public class Profesor extends HomoSapiens {

    private String especialidad;

    /**
     * especializa sobreescribiendo el método
     * super hace referncia a la superclase (HomoSapiens)
     */
    @Override
    public void hablar() {
        super.hablar();
        System.out.println("Soy profesor de " + especialidad);
    }

}
