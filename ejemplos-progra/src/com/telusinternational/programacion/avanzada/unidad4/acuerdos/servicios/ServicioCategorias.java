package com.telusinternational.programacion.avanzada.unidad4.acuerdos.servicios;

import com.telusinternational.programacion.avanzada.unidad4.acuerdos.Categoria;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Kenny
 */
public class ServicioCategorias {

    private ArrayList<Categoria> bd;

    public ServicioCategorias() {
        bd = new ArrayList();
    }

    
    
    public String agregarCategoria(String nombre, String descripcion) {

        if (nombre == null || nombre.isEmpty()) {
            return "Error: debes especificar el nombre!!";
        }

        //creo un objeto vacio
        Categoria nuevaCategoria = new Categoria();
        //asigno el nombre al nuevo objeto
        nuevaCategoria.setNombre(nombre);
        //asigno la descripcion al nuevo objeto
        nuevaCategoria.setDescripcion(descripcion);
        //registro la fecha actual
        nuevaCategoria.setFechaRegistrado(new Date());

        //agrego el nuevo objeto a mi lista (bd)
        bd.add(nuevaCategoria);

        System.out.println("Cantidad de categorias: " + bd.size());

        return "Categoria agregada exitosamente!";
    }

    public String actualizarCategoria() {
        return "Categoria actualizada exitosamente!";
    }

    public String eliminarCategoria(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            return "Error: debes especificar el nombre!!";
        }

        if (bd.isEmpty()) {
            return "Error: no hay categorias registradas!!";
        }
        int indiceEliminar = -1;
        for (int i = 0; i < bd.size(); i++) {
            Categoria aux = bd.get(i);
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                indiceEliminar = i;
                break;
            }
        }

        bd.remove(indiceEliminar);

        return "Categoria eliminada exitosamente!";
    }

    public List<Categoria> buscarCategoria(String criterioBusqueda) {
        return null;
    }

    public void imprimirCategorias() {
        for (int i = 0; i < bd.size(); i++) {
            Categoria aux = bd.get(i);
            System.out.println(
                    "NOMBRE: " + aux.getNombre()
                    + "  DESCRIPCION: " + aux.getDescripcion()
            );
        }
    }

}
