package com.telusinternational.programacion.avanzada.unidad4.herencia;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * Homo sapiens (del latín, homo ‘hombre’ y sapiens ‘sabio’) es una especie del
 * orden de los primates perteneciente a la familia de los homínidos. También
 * son conocidos bajo la denominación genérica de «hombres», aunque ese término
 * es ambiguo y se usa también para referirse a los individuos de sexo masculino
 * y, en particular, a los varones adultos.2​3​ Los seres humanos poseen
 * capacidades mentales que les permiten inventar, aprender y utilizar
 * estructuras lingüísticas complejas, lógicas, matemáticas, escritura, música,
 * ciencia, y tecnología. Los humanos son animales sociales, capaces de
 * concebir, transmitir y aprender conceptos totalmente abstractos.
 *
 * Se consideran Homo sapiens de forma indiscutible a los que poseen tanto las
 * características anatómica de las poblaciones humanas actuales como lo que se
 * define como «comportamiento moderno»
 *
 * @author Kenny
 */
public class HomoSapiens extends AbstractHablador {

    private String nombre;
    private Date fechaNacimiento;

    /**
     * se especializa el metodo hablar al sobreescribirlo
     */
//    @Override
//    public void hablar() {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        System.out.println("Hola..");
//        System.out.println("Mi nombre es " + nombre);
//        System.out.println("Mi fecha de nacimiento es " + sdf.format(fechaNacimiento));
//    }
//    
    public void caminar(){
        
    }

    @Override
    void decirMiNombre() {
        System.out.println("Mi nombre es " + nombre);
    }

    @Override
    void decirProfesion() {
        
    }

    @Override
    void decirFechaNacimiento() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Mi fecha de nacimiento es " + sdf.format(fechaNacimiento));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    

}
