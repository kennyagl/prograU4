package unidad4.ordenamiento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kenny
 */
public class SelectionSort {

    public void ordenar(int[] A) {
        int menor, indice;
        int n = A.length;

        for (int i = 0; i <= n - 1; i++) {
            menor = A[i];
            indice = i;

            for (int j = i + 1; j <= n - 1; j++) {
                if (menor > A[j]) {
                    menor = A[j];
                    indice = j;
                }
            }
            A[indice] = A[i];
            A[i] = menor;
        }
    }

    public void ordenar(String[] A) {
        String menor;
        int indice;
        int n = A.length;

        for (int i = 0; i <= n - 1; i++) {
            menor = A[i];
            indice = i;

            for (int j = i + 1; j <= n - 1; j++) {
                if (menor.compareTo(A[j]) > 0) {
                    menor = A[j];
                    indice = j;
                }
            }
            A[indice] = A[i];
            A[i] = menor;
        }
    }

    public void ordenar(Documento[] A) {
        Documento menor;
        int indice;
        int n = A.length;

        for (int i = 0; i <= n - 1; i++) {
            menor = A[i];
            indice = i;

            for (int j = i + 1; j <= n - 1; j++) {
                if (menor.compareTo(A[j]) > 0) {
                    menor = A[j];
                    indice = j;
                }
            }
            A[indice] = A[i];
            A[i] = menor;
        }
    }

    public void ordenar(List<Documento> A) {
        Documento menor;
        int indice;
        int n = A.size();

        for (int i = 0; i <= n - 1; i++) {
            menor = A.get(i);
            indice = i;

            for (int j = i + 1; j <= n - 1; j++) {
                int resultadoComparacion = Documento.COMPARATOR_IDENTIFICADOR.compare(menor, A.get(j));
                //if (menor.compareTo(A.get(j)) > 0) {
                if(resultadoComparacion > 0){
                    
                    menor = A.get(j);
                    indice = j;
                }
            }
            A.set(indice, A.get(i));
            A.set(i, menor);            
        }
    }

    public void imprimirArreglo(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + ", ");
        }
        System.out.println();
    }

    
    public void imprimirArreglo(Object[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            System.out.print(A[i].toString() + ", ");
        }
        System.out.println();
    }
    
    
    public void imprimirLista(List<Documento> list) {
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arreglo = {7, 4, 6, 1, 8, 3, 5, 9, 11, 3};

        SelectionSort ordenamiento = new SelectionSort();

        ordenamiento.imprimirArreglo(arreglo);
        ordenamiento.ordenar(arreglo);
        ordenamiento.imprimirArreglo(arreglo);

        String[] arregloStrings = {"a", "g", "u", "i", "l", "a", "r"};
        ordenamiento.imprimirArreglo(arregloStrings);
        ordenamiento.ordenar(arregloStrings);
        ordenamiento.imprimirArreglo(arregloStrings);

        Documento documento4 = new Documento(4, "CUATRO");
        Documento documento1 = new Documento(3, "TRES");
        Documento documento2 = new Documento(1, "UNO");
        Documento documento3 = new Documento(2, "DOS");

        Documento[] documentos = {documento1, documento2, documento3};
        ordenamiento.imprimirArreglo(documentos);
        ordenamiento.ordenar(documentos);
        ordenamiento.imprimirArreglo(documentos);
        
        List<Documento> lstDocumentos = new ArrayList();
        lstDocumentos.add(documento1);
        lstDocumentos.add(documento2);
        lstDocumentos.add(documento3);
        lstDocumentos.add(documento4);
        ordenamiento.imprimirLista(lstDocumentos);
        ordenamiento.ordenar(lstDocumentos);
        ordenamiento.imprimirLista(lstDocumentos);
        

    }

}
