package sortAlgo;
// O(n^2)
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1, 22, 3, 44, 6 ,10 , 12, 55, 30, 12};
        for (int i = 0;i < array.length-1; ++i) {
            for (int j = 0;j<array.length-1; ++j) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i:array) System.out.println(i + " ");
    }

    
}