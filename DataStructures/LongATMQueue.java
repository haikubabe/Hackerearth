import java.util.Scanner;

public class LongATMQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i=0;i<n;i++) {
            h[i] = sc.nextInt();
        }
        int g=1, prev=h[0];
        for (int i=1;i<n;i++) {
            if (h[i]<prev) {
                g++;
            }
            prev=h[i];
        }
        System.out.println(g);
    }
}
