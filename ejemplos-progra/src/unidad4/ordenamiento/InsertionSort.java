package unidad4.ordenamiento;

/**
 *
 * @author Kenny
 */
public class InsertionSort {


    public void ordenar(int[] A) {
        int i = 1;
        int longitudArreglo = A.length;
        while (i < longitudArreglo) {
            int j = i;
            while (j > 0 && A[j - 1] > A[j]) {
                intercambiar(A, j, (j - 1));
                j--;
            }
            i++;
        }
    }

    private void intercambiar(int[] A, int indiceOrigen, int indiceDestino) {
        int temporal = A[indiceOrigen];
        A[indiceOrigen] = A[indiceDestino];
        A[indiceDestino] = temporal;
    }

    public void imprimirArreglo(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + ", ");
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arreglo = {7, 4, 6, 1, 8, 3, 5, 9, 11, 3};
        InsertionSort sort = new InsertionSort();
        sort.imprimirArreglo(arreglo);
        sort.ordenar(arreglo);
        sort.imprimirArreglo(arreglo);
    }
}
