import java.util.Scanner;

public class SnackDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            int n = sc.nextInt();
            int[] c = new int[n];
            int p = sc.nextInt();
            for (int i=0;i<p;i++) {
                int a = sc.nextInt();
                c[a-1]++;
            }
            int q = sc.nextInt();
            for (int i=0;i<q;i++) {
                int a = sc.nextInt();
                c[a-1]++;
            }
            boolean canSolve=true;
            for (int i=0;i<n;i++) {
                if (c[i]==0) {
                    canSolve=false;
                    break;
                }
            }
            if (canSolve) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }
}
