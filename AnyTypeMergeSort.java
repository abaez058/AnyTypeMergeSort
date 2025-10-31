public class AnyTypeMergeSort<T extends Comparable<T>> {

    public void mergeSort(T[] A, int p, int r) {
        if (p >= r) return;

        int q = (p + r) / 2;
        mergeSort(A, p, q);
        mergeSort(A, q + 1, r);
        merge(A, p, q, r);
    }

    public void merge(T[] A, int p, int q, int r) {
        int nL = q - p + 1;
        int nR = r - q;

        T[] L = (T[]) new Comparable[nL];
        T[] R = (T[]) new Comparable[nR];

        for (int i = 0; i < nL; i++)
            L[i] = A[p + i];
        for (int j = 0; j < nR; j++)
            R[j] = A[q + 1 + j];

        int i = 0, j = 0, k = p;

        while (i < nL && j < nR) {
            if (L[i].compareTo(R[j]) <= 0) {
                A[k++] = L[i++];
            } else {
                A[k++] = R[j++];
            }
        }

        while (i < nL) A[k++] = L[i++];
        while (j < nR) A[k++] = R[j++];
    }

    public static void main(String[] args) {
        AnyTypeMergeSort<String> sorter = new AnyTypeMergeSort<>();
        String[] array = {"banana", "apple", "orange", "grape"};

        System.out.println("Original array:");
        for (String s : array) System.out.print(s + " ");

        sorter.mergeSort(array, 0, array.length - 1);

        System.out.println("\nSorted array:");
        for (String s : array) System.out.print(s + " ");
    }
}
