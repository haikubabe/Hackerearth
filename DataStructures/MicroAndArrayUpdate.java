import java.util.Scanner;

public class MicroAndArrayUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i=0;i<n;i++) {
                a[i] = sc.nextInt();
            }
            int min=a[0];
            for (int i=1;i<n;i++) {
                if (a[i]<min) {
                    min=a[i];
                }
            }
            if (k<=min) {
                System.out.println(0);
            } else {
                System.out.println(k-min);
            }
            t--;
        }
    }
}
