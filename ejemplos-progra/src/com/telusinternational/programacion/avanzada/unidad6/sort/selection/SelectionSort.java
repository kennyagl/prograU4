package com.telusinternational.programacion.avanzada.unidad6.sort.selection;

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
                    //if (menor > A[j]) {
                    menor = A[j];
                    indice = j;
                }
            }
            A[indice] = A[i];
            A[i] = menor;
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

    }

}
