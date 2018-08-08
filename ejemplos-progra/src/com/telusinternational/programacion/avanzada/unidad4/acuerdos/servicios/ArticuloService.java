package com.telusinternational.programacion.avanzada.unidad4.acuerdos.servicios;

import com.telusinternational.programacion.avanzada.unidad4.acuerdos.Articulo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kenny
 */
public class ArticuloService extends AbstractServicio {

    private ArrayList<Articulo> bd;

    @Override
    List getBD() {
        return this.bd;
    }

    @Override
    boolean identificadoresCoinciden(Object objeto1, Object objeto2) {
        Articulo articulo1 = (Articulo) objeto1;
        Articulo articulo2 = (Articulo) objeto2;
        
        return (articulo1.getNumero().intValue() == articulo2.getNumero());
        
    }

    @Override
    void actualizarRegistro(Object objetoOriginal, Object objetoNuevo) {
        Articulo original = (Articulo) objetoOriginal;
        Articulo nuevo = (Articulo) objetoNuevo;

        original.setNombre(nuevo.getNombre());
        original.setEstado(nuevo.getEstado());
        original.setDescripcion(nuevo.getDescripcion());

    }

}
