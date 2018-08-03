package com.telusinternational.programacion.avanzada.unidad4.acuerdos;

import com.telusinternational.programacion.avanzada.unidad4.acuerdos.servicios.ServicioCategorias;

/**
 *
 * @author Kenny
 */
public class Principal {

    public static void main(String[] args) {
        ServicioCategorias servicioCategorias = new ServicioCategorias();

        servicioCategorias.agregarCategoria(
                "Instruccion",
                "Una instruccion / orden de la autoridad superior"
        );

        servicioCategorias.agregarCategoria(
                "Manual de organización",
                null);
        
        servicioCategorias.agregarCategoria(
                "Manual de funciones",
                null);
        
        servicioCategorias.imprimirCategorias();

    }
}
