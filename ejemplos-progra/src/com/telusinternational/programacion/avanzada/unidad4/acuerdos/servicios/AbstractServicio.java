package com.telusinternational.programacion.avanzada.unidad4.acuerdos.servicios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kenny
 */
public abstract class AbstractServicio implements ServicioInterface {

    /**
     * Devuelve una lista que representa mi base de datos
     *
     * @return
     */
    abstract List getBD();

    /**
     * Dados dos objetos me devuelve valor booleano true si coinciden y false si
     * no coinciden
     *
     * @param objeto1
     * @param objeto2
     * @return
     */
    abstract boolean identificadoresCoinciden(Object objeto1, Object objeto2);

    /**
     * actualiza los valores del objeto original con los valores del objeto
     * nuevo
     *
     * @param objetoOriginal
     * @param objetoNuevo
     */
    abstract void actualizarRegistro(Object objetoOriginal, Object objetoNuevo);

    @Override
    public String guardar(Object object) {
        getBD().add(object);
        return "Regisro guardado exitosamente!";
    }

    @Override
    public String actualizar(Object object) {
        for (int i = 0; i < getBD().size(); i++) {
            if (identificadoresCoinciden(object, getBD().get(i))) {
                actualizarRegistro(getBD().get(i), object);
                break;
            }
        }
        return "Regisro actualizado exitosamente!";
    }

    @Override
    public String eliminar(Object object) {
        int indiceEliminar = -1;
        for (int i = 0; i < getBD().size(); i++) {
            if (identificadoresCoinciden(object, getBD().get(i))) {
                indiceEliminar = i;
                break;
            }
        }
        if (indiceEliminar >= 0) {
            getBD().remove(indiceEliminar);
            return "Regisro eliminado exitosamente!";
        } else {
            return "Regisro no fue encontrado!";
        }

    }

//    @Override
//    public List buscar(String criterioBusqueda) {
//        List resultados = new ArrayList();
//        for (int i = 0; i < getBD().size(); i++) {
//            if (identificadoresCoinciden(object, getBD().get(i))) {
//                indiceEliminar = i;
//                break;
//            }
//        }
//    }
}
