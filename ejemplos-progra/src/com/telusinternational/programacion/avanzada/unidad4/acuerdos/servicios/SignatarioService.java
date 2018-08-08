
package com.telusinternational.programacion.avanzada.unidad4.acuerdos.servicios;

import com.telusinternational.programacion.avanzada.unidad4.acuerdos.Signatario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kenny
 */
public class SignatarioService extends AbstractServicio {
    
    private ArrayList<Signatario> bd;
    
    @Override
    List getBD() {
        return this.bd;
    }

    @Override
    boolean identificadoresCoinciden(Object objeto1, Object objeto2) {
        Signatario signatario1 = (Signatario) objeto1;
        Signatario signatario2 = (Signatario) objeto2;
        if(signatario1.getNombres().equalsIgnoreCase(signatario2.getNombres())
                && signatario1.getApellidos().equalsIgnoreCase(signatario2.getApellidos())
                && signatario1.getPuesto().equalsIgnoreCase(signatario2.getPuesto()) ){
            return true;
        }
        return false;
    }

    @Override
    void actualizarRegistro(Object objetoOriginal, Object objetoNuevo) {
        Signatario original = (Signatario) objetoOriginal;
        Signatario nuevo = (Signatario) objetoNuevo;
        
        original.setNombres(nuevo.getNombres());
        original.setApellidos(nuevo.getApellidos());
        original.setPuesto(nuevo.getPuesto());
        
    }
    
}
