
package examen;

/**
 *
 * @author Kenny
 */
public class Hamburguesa extends Producto implements Repartible{
    
    String ingredientes;
    Double peso;
    Double precio;
    Double tiempoPreparacion;
    
    public Hamburguesa(int codigo, String nombre, Double peso) {
        super(codigo, nombre);
        this.peso = peso;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(Double tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    
    public boolean repartir() {
        if(this.precio > 25){
            return true;
        }else{
            return false;
        }
    }
    
    
    
}
