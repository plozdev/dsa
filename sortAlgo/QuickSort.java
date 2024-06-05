package sortAlgo;

public class QuickSort {

    public static void main(String[] args) {
        int n = 5;
        int[]a =  {1, 3, 5, 2, 4};
        quickSort(n, a);
    }

    public static void quickSort(int n, int[] a) {
        int pivot = a[n-1];
        int i = -1, j = 0;
        while (j<=n-1) {
            if (a[j]<=pivot) {
                i++;
                int tmp = a[j];
                a[j] = a[i];
                a[i] = tmp;
            }
            else {
                j++;
            }
        }
        for (int k:a) System.out.println(k);
    }
}


