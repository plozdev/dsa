package sortAlgo;


import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 3, 4, 6, 7, 10, 13, 2};
        SelectionSort(array);
        for (int i:array) System.out.println(i + " ");
    }
    private static void SelectionSort (int[] array) {
        for (int i=0;i<array.length-1;i++ ) {
            int min = i;
            for (int j=i+1;j<array.length;++j) {
                if (array[j] < array[min]) min = j;
            }   
            int t = array[i];
            array[i] = array[min];
            array[min] = t;
            // swap(array[i], array[min]);
        }
    }

}