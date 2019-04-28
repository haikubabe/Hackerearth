import java.util.Scanner;

public class BiasedChandan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
            if (i>0 && a[i] == 0) {
                int j=i-1;
                while (a[j]==0) {
                    j--;
                }
                a[j]=0;
            }
        }
        int sum=0;
        for (int i=0;i<n;i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
