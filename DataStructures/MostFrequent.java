import java.util.Scanner;

public class MostFrequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] pos = new int[1000001];
        int[] neg = new int[1000001];
        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
            if (a[i] >= 0) {
                pos[a[i]]++;
            } else {
                neg[Math.abs(a[i])]++;
            }
        }
        int pmax=0,nmax=0,ppos=0,npos=0;
        for (int i=0;i<1000001;i++) {
            if (pos[i]>pmax) {
                pmax = pos[i];
                ppos = i;
            }
            if (neg[i]>=nmax) {
                nmax = neg[i];
                npos = i;
            }
        }
        if (pmax>nmax) {
            System.out.println(ppos);
        } else {
            System.out.println(-npos);
        }
    }
}
