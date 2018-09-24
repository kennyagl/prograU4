package unidad4.ordenamiento;

/**
 *
 * @author Kenny
 */
public class ShellSort {

    public void ordenar(int[] A) {

        int longitudArreglo = A.length;
        int gap = longitudArreglo / 2;
        while (gap > 0) {
            ordenar(A, gap);
            gap = gap / 2;
        }

    }

    public void ordenar(int[] A, int gap) {
        int i = 1;
        int longitudArreglo = A.length;
        while (i < longitudArreglo) {
            int j = i;
            while (j >= gap && A[j - gap] > A[j]) {
                ArrayUtils.intercambiar(A, j, (j - 1));
                j = j - gap;
            }
            i = i + gap;
        }

    }

    public static void main(String[] args) {
        int[] arreglo = {7, 4, 6, 1, 8, 3, 5, 9, 11, 3};
        ShellSort sort = new ShellSort();
        ArrayUtils.imprimirArreglo(arreglo);
        sort.ordenar(arreglo);
        ArrayUtils.imprimirArreglo(arreglo);
    }
}
