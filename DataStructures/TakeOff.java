import java.util.Scanner;

public class TakeOff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            int count = 0;
            for (int i=1;i<=n;i++) {
                if (i%p == 0 && i%q !=0 && i%r != 0) {
                    count++;
                } else if (i%q == 0 && i%p !=0 && i%r != 0) {
                    count++;
                } else if (i%r == 0 && i%p !=0 && i%q != 0) {
                    count++;
                }
            }
            System.out.println(count);
            t--;
        }
    }
}
