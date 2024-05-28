import java.util.*;

public class Main {


    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < 100000; i++) array[i] = i;
        int target = 99999;
        System.out.println("BinarySearch");
        long startTime = System.nanoTime();
        int index = binarySearch(array,target);
        long endTime = System.nanoTime();
        if (index!=-1) {
            System.out.println(target + " founded at: " + index);
            System.out.println(endTime-startTime);
        }
        else System.out.println("NOt FOUND!");

        System.out.println("-------------------------");
        System.out.println("LinearSeach");
        startTime = System.nanoTime();
        index = linearSearch(array,target);
        endTime = System.nanoTime();
        if (index!=-1) {
            System.out.println(target + " founded at: " + index);
            System.out.println(endTime-startTime);
        }
        else System.out.println("NOt FOUND!");
    }
    
    private static int linearSearch(int[] array, int target) {
        for (int i=0;i< array.length;++i) {
            if (array[i]==target) return i;
        }
        return -1;
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0, right = array.length-1;
        while (low<=right) {
            int mid = low+(right-low)/2;
            if (target==array[mid]) {
                return mid;
            }
            else if (array[mid]<target) {
                low = mid+1;
            }
            else right = mid-1;
        }
        return -1;
    }

}
