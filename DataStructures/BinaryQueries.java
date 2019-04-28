import java.util.Scanner;

public class BinaryQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0;i<q;i++) {
            int query = sc.nextInt();
            if (query == 1) {
                int x = sc.nextInt();
                if (x>=1 && x<=n) {
                    a[x-1] = a[x-1]^1;
                }
            } else {
                int l = sc.nextInt();
                int r = sc.nextInt();
                if (a[r-1] == 0) {
                    System.out.println("EVEN");
                } else {
                    System.out.println("ODD");
                }
            }
        }
    }
}
