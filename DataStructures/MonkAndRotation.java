import java.io.PrintWriter;
import java.util.Scanner;

public class MonkAndRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (k>n) {
                k = k%n;
            }
            int[] a = new int[1000000];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int index = (n-(k-1))-1;
            if (index < n) {
                out.print(a[index] + " ");
            }
            for (int i=index+1;i<n;i++) {
                out.print(a[i] + " ");
            }
            for (int i=0;i<index;i++) {
                out.print(a[i] + " ");
            }
            out.println();
            t--;
        }
    }
}
