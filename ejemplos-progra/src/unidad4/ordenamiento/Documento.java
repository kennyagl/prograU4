package unidad4.ordenamiento;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author Kenny
 */

public class Documento implements Comparable<Documento> {

    private Integer correlativo;
    private String identificador;
    private Date fecha;

    public Documento() {
    }

    public Documento(Integer correlativo, String identificador) {
        this.correlativo = correlativo;
        this.identificador = identificador;
        this.fecha = new Date();
    }

    public Integer getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(Integer correlativo) {
        this.correlativo = correlativo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public static Comparator<Documento> COMPARATOR_FECHA = new Comparator<Documento>() {
        @Override
        public int compare(Documento o1, Documento o2) {
            return o1.getFecha().compareTo(o2.getFecha());
        }

    };

    public static Comparator<Documento> COMPARATOR_IDENTIFICADOR = new Comparator<Documento>() {
        @Override
        public int compare(Documento o1, Documento o2) {
            return o1.getIdentificador().compareTo(o2.getIdentificador());
        }

    };

    public static Comparator<Documento> COMPARATOR_CORRELATIVO = new Comparator<Documento>() {
        @Override
        public int compare(Documento o1, Documento o2) {
            return o1.getCorrelativo().compareTo(o2.getCorrelativo());
        }

    };

    @Override
    public int compareTo(Documento o) {
        return this.correlativo.compareTo(o.getCorrelativo());
    }

    @Override
    public String toString() {
        return  correlativo + ", " + identificador + ", " + dateFormat.format(fecha) ;
    }

    public static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    
    
    
}
