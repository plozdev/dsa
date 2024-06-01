package algo;

public class RecursionExample {
    public static void main(String[] args) {

        long startTime, endTime;
        int target = 20;
        try {
            startTime = System.nanoTime();
            System.out.println(fibo(target)); //ĐỆ QUY
            endTime = System.nanoTime();
            System.out.println(endTime-startTime);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("ERROR");
        }
        System.out.println("-----------------");
        try {
            startTime = System.nanoTime();
            System.out.println(Fibo(target)); //QHĐ
            endTime = System.nanoTime();
            System.out.println(endTime-startTime);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("ERROR");
        }
        
        
    }

    private static long Fibo(int num) {
        long[] F = new long[100000];
        F[0] = F[1] = 1;
        for (int i=2;i<100000;++i) {
            F[i] = F[i-1] + F[i-2];
        }
        return F[num];
    }
    private static int fibo(int num) {
        if (num==0 || num==1) return 1;
        return fibo(num-2) + fibo(num-1);
    }
}
