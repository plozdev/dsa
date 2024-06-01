package sortAlgo;
// O(n^2)
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9, 2, 1, 4, 3, 6, 5, 10 ,12};

        insertionSort(arr);
        print(arr);

    }


    public static void insertionSort(int[] arr) {
        for (int i=1;i<arr.length; ++i) {
            int tmp = arr[i];
            int j=i-1;
            
            while (j >= 0 && arr[j] > tmp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = tmp;
        }
    } 

    public static void print(int[] arr) {
        for (int i:arr) {
            System.out.println(i + " ");
        }
    }
    
}
