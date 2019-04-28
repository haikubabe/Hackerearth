import java.util.Scanner;

public class ModifySequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        boolean flag=true;
        for (int i=0;i<n-1;i++) {
            int val = a[i+1]-a[i];
            if (val<0) {
                flag = false;
                break;
            }
            a[i+1] = val;
            a[i] = 0;
        }
        if (a[n-1] != 0) {
            flag = false;
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
