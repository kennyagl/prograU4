package com.telusinternational.programacion.avanzada.unidad4.acuerdos;

import com.telusinternational.programacion.avanzada.unidad4.acuerdos.servicios.ServicioCategorias;
import com.telusinternational.programacion.avanzada.unidad4.acuerdos.servicios.SignatarioService;

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
        
        SignatarioService signatarioService = new SignatarioService();
        
        Signatario signatario = new Signatario();
        signatario.setNombres("Juan");
        signatario.setApellidos("Perez");
        signatario.setPuesto("Jefe");
        
        signatarioService.guardar(signatario);

    }
}
