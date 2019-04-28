import java.util.Scanner;

public class MarkTheAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        int score=0, skip=0;
        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++) {
            if (a[i]<=x) {
                score++;
            } else {
                skip++;
            }
            if (skip>1) {
                break;
            }
        }
        System.out.println(score);
    }
}
