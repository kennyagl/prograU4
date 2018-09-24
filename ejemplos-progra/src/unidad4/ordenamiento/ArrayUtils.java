package unidad4.ordenamiento;

/**
 *
 * @author Kenny
 */
public class ArrayUtils {

    public static void imprimirArreglo(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + ", ");
        }
        System.out.println();
        System.out.println();
    }

    public static void imprimirArreglo(Object[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            System.out.print(A[i].toString() + ", ");
        }
        System.out.println();
    }

    public static void intercambiar(int[] A, int indiceOrigen, int indiceDestino) {
        int temporal = A[indiceOrigen];
        A[indiceOrigen] = A[indiceDestino];
        A[indiceDestino] = temporal;
    }

}
