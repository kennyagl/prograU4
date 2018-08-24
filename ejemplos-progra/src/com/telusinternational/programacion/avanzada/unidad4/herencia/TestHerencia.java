
package com.telusinternational.programacion.avanzada.unidad4.herencia;

import java.util.Date;

/**
 *
 * @author Kenny
 */
public class TestHerencia {
    
    public static void main(String[] args){
        HomoSapiens hablador = new HomoSapiens();
        hablador.setFechaNacimiento(new Date());
        hablador.setNombre("juan");
        hablador.hablar();
        
        
        
        Profesor profe = new Profesor();
        profe.especialidad = "IT";
        profe.setNombre("Juan");
       
        HomoSapiens homo = profe;
        
        
        System.out.println(homo.getNombre());
        System.out.println(profe.especialidad);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
