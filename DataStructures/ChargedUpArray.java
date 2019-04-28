import java.util.*;

public class ChargedUpArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            // k is the no. of subsets of array a, that consists of element a[i]
            long k = Math.round(Math.pow(2,n-1));
            long sum=0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                if (a[i]>=k) {
                    sum = (sum + a[i])%Math.round((Math.pow(10, 9) + 7));
                }
            }
            System.out.println(sum);
            t--;
        }
    }
}
