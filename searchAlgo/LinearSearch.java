package searchAlgo;


public class LinearSearch {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i=0;i<15;++i) array[i] = i;
        int target = 14;
        
        int index = linearSearch(array, target);
        if (index!=-1) System.out.println(target + " is at: " + index);
        else System.out.println("nah");
    }
    private static int linearSearch (int[] array, int target) {
        for (int i=0;i<array.length;++i) {
            if (array[i] == target) return i;
        }
        return -1;
    }
}
