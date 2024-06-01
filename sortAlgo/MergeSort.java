package sortAlgo;
// Best Case: O(n log n), When the array is already sorted or nearly sorted.
// Average Case: O(n log n), When the array is randomly ordered.
// Worst Case: O(n log n), When the array is sorted in reverse order.

public class MergeSort {
    
    private static void sort(int[] arr) {
        int length = arr.length;
        if (length <= 1) return; 
        int mid = length/2;
        int[] L = new int[mid];
        int[] R = new int[length-mid];

        for (int i=0,j=0;i<length;++i) {
            if (i<mid) L[i] = arr[i];
            else {
                R[j] = arr[i];
                j++;
            }
        }

        sort(L);
        sort(R);
        merge(L,R,arr);
    }

    private static void merge(int[] L, int [] R, int[] arr) {
        int lSize = arr.length/2;
        int rSize = arr.length - lSize;
        int i = 0, l = 0, r = 0;

        while (l < lSize && r < rSize) {
            if (L[l] < R[r]) {
                arr[i] = L[l];
                i++; 
                l++;
            } else {
                arr[i] = R[r];
                i++;
                r++;
            }
        }

        while (l < lSize) {
            arr[i] = L[l];
            i++;
            l++;
        }
        while (r < rSize) {
            arr[i] = R[r];
            i++;
            r++;
        }

    }
    private static void print(int[] arr) {
        for (int i:arr) System.out.println(i + " ");
    }
    public static void main(String[] args) {
        int[] arr = {8, 2, 5, 3, 4, 7,6 ,1 };
        sort(arr);
        print(arr);
    }
}
