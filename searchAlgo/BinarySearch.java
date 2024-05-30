package searchAlgo;
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i=0;i<15;++i) array[i] = i;
        int target = 14;
        
        int index = binarySearch(array, target);
        if (index!=-1) System.out.println(target + "is at: " + index);
        else System.out.println("nah");
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length-1;
        while (low<=high) {
            int mid = low + (high-low)/2;
            if (target == array[mid]) return mid;
            else if (target < array[mid]) high = mid-1;
            else low = mid+1;
        }

        return -1;
    }
}
