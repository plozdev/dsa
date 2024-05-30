import java.util.*;
public class Main {

    public static void main(String[] args) {
        int[] array = new int[1000];
        for (int i=0;i<1000;++i) array[i] = i;
        int target = 100;
        long startTime, endTime;
        startTime = System.nanoTime();
        int index = interpolationSearch(array, target);
        endTime = System.nanoTime();
        if (index!=-1) {
            System.out.println("Element founded at: " + index);
        } else System.out.println("NO");
        System.out.println(endTime-startTime);
    }
    public static int interpolationSearch(int[] array, int target) {
        int left = 0;
        int right = array.length-1;
        while (target >= array[left] && target <= array[right] && left <= right) {
            int mid = left + (target - array[left])*(right-left) / (array[right] - array[left]);
            if (array[mid]==target) {
                return mid;
            }
            else if (target>array[mid]) {
                left = mid+1;
            }
            else right = mid-1;
        }
        return -1;
    }
}
