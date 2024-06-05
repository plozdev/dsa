import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int f = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n+1];
            int[] b = new int[n+1];
            for (int i=1;i<=n;i++) {
                b[i] = sc.nextInt();
            }
            System.out.println(solve(n, f, k, b));
        }
        
        
    }

    public static String solve(int n, int f, int k, int[]b) {
        int[] a = new int[n+1];
        int favourite = b[f];
        Arrays.sort(b);
        for (int i=1;i<=n;i++) {
            a[i] = b[n-i+1];
        }
        // Arrays.sort(a, Collections.reverseOrder());
        if (n==k) return "YES";
        
        // boolean check = true;
        for (int i=1;i<=k;i++) {
            if (a[i]==favourite) {
                if (a[k+1]!=favourite) return "YES";
                else return "MAYBE";                
            }
        }
        return "NO";
    }
}
