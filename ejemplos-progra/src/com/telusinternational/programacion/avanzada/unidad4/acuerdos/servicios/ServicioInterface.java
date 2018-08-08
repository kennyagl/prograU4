
package com.telusinternational.programacion.avanzada.unidad4.acuerdos.servicios;

import java.util.List;

/**
 *
 * @author Kenny
 */
public interface ServicioInterface {
    
    public String guardar(Object object);
    public String actualizar(Object object);
    public String eliminar(Object object);
//    public List buscar(String criterioBusqueda);
}
