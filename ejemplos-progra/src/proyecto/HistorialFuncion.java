package proyecto;

/**
 *
 * @author Kenny
 */
public class HistorialFuncion {

    private String expresion;
    private Double resultado;

    public HistorialFuncion(String expresion, Double resultado) {
        this.expresion = expresion;
        this.resultado = resultado;
    }

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

}
