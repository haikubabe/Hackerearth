import java.util.Scanner;

public class PolygonPossibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum=0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            boolean possible = true;
            for (int i=0;i<n;i++) {
                if (a[i] >= (sum-a[i])) {
                    possible = false;
                    break;
                }
            }
            if (possible) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            t--;
        }
    }
}
