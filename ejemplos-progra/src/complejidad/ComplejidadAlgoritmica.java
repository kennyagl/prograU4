package complejidad;

import java.util.List;

/**
 *
 * @author Kenny
 */
public class ComplejidadAlgoritmica {
    
    
    // 1 = O(1)
    public String obtenerPrimerElemento(String[] list) {
        if (list.length > 0) {
            return list[0];
        }
        return null;
    }
    
    
    
    
    
    //O(1) = 1
    public String obtenerPrimerElemento(List<String> list) {
        if (!list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    
    
    
    // 1 = O(1)
    
    public void complejidadConstante(String[] arregloString) {
        System.out.println(arregloString[0]);

    }

    /////////////////////////////////////////////////////////////////////////////
    ////////////////////////// LINEAL ///////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////
    //n puede ser la entrada misma o el tamanio de la entrada
    
    // O(n)
    public void complejidadLineal(String[] arregloString) {
        for (int i = 0; i < arregloString.length; i++) {
            System.out.println(arregloString[i]);
        }
    }
    //O(n)
    public void contarHasta(Integer limite) {
        for (int i = 0; i < limite; i++) {
            System.out.println(i);
        }
    }

    //el analisis asintótico indica que se deben eliminar las constantes
    // n + n = 2n = O(n)
        
    public void eliminarConstantes(String[] arregloString) {
        
        for (int i = 0; i < arregloString.length; i++) {
            System.out.println("a. " + arregloString[i]);
        }

        for (int i = 0; i < arregloString.length; i++) {
            System.out.println("b. " + arregloString[i]);
        }

    }

    //el analisis asintótico indica que se deben eliminar las constantes
    // 100 + 1 +n/2 = n = O(n)
    
    // 100 + 1 + n*1/2 = n = O(n)
    public void eliminarConstantes2(String[] arregloString) {

        for (int i = 0; i < 100; i++) {
            if (arregloString.length < i) {
                break;
            }
            System.out.println(arregloString[i]);
        }

        System.out.println(arregloString[arregloString.length - 1]);

        int mitadLongitud = arregloString.length / 2;
        int indice = 0;
        
        while (indice < mitadLongitud) {
            System.out.println(arregloString[indice]);
            indice++;
        }

    }
    
    
    
    

    // n * n = n^2 = O(n^2)
    
    //[a, b, c]= a,a a,b a,c b,a b,b b,c c,a c,b  c,c
    // 3 * 3 = n*n = n^2 = O(n^2)
    
    public void complejidadCuadratica(String[] arregloString) {
        for (int i = 0; i < arregloString.length; i++) {
            for (int j = 0; j < arregloString.length; j++) {
                //imprimo todos pares ordenados
                System.out.println("[" + arregloString[i] + "," + arregloString[j] + "]");
            }
        }

    }

    
    //el analisis asintótico indica que se deben eliminar los terminos menos significativos
    // n + n^2 = O(n^2)
    
    // n + n^2 = O(n^2)
    public void eliminarTerminosMenosSignificativos(String[] arregloString) {
        for (int i = 0; i < arregloString.length; i++) {
            System.out.println(arregloString[i]);
        }
        
         for (int i = 0; i < arregloString.length; i++) {
            for (int j = 0; j < arregloString.length; j++) {
                //imprimo todos pares ordenados
                System.out.println("[" + arregloString[i] + "," + arregloString[j] + "]");
            }
        }
    }
    
    
}
