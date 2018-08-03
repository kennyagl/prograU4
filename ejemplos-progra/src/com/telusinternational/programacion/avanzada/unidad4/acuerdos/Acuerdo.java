package com.telusinternational.programacion.avanzada.unidad4.acuerdos;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Kenny
 */
class Acuerdo {

    String numero;
    String nombre;
    String descripcion;
    Date fechaEmision;
    Date fechaVigencia;
    
    /**
     * nombre de la categoría seleccionada del catálogo
     */
    String categoria;
    /**
     * VIGENTE
     * DEROGADO
     */
    String estado;
    List<Articulo> articulos;
    List<Capitulo> capitulos;
    List<Signatario> signatarios;
    
    

}
