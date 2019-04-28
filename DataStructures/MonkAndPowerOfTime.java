import java.util.Scanner;

public class MonkAndPowerOfTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[n];
        int[] e = new int[n];
        for (int i=0;i<n;i++) {
            c[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++) {
            e[i] = sc.nextInt();
        }
        int t=0,i=0;
        while (i<n) {
            if (c[i]!=e[i]) {
                int temp=c[i];
                int j;
                for (j=i+1;j<n;j++) {
                    c[j-1] = c[j];
                }
                c[j-1] = temp;
                t++;

            } else {
                c[i]=0;
                e[i]=0;
                t++;
                i++;
            }
        }
        System.out.println(t);
    }
}
