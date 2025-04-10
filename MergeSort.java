import java.util.Arrays;

public class MergeSort {    
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;
        int[] izq = Arrays.copyOfRange(arr, 0, mid);
        int[] der = Arrays.copyOfRange(arr, mid, arr.length);        
        mergeSort(izq);
        mergeSort(der);        
        merge(arr, izq, der);
    }
    private static void merge(int[] arr, int[] izq, int[] der) {
        int i = 0, j = 0, k = 0;
        while (i < izq.length && j < der.length) {
            if (izq[i] <= der[j]) {
                arr[k++] = izq[i++];
            } else {
                arr[k++] = der[j++];
            }
        }        
        while (i < izq.length) {
            arr[k++] = izq[i++];
        }        
        while (j < der.length) {
            arr[k++] = der[j++];
        }
    }
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Arreglo: " + Arrays.toString(arr));        
        mergeSort(arr);        
        System.out.println("Ordenado: " + Arrays.toString(arr));
    }
}
