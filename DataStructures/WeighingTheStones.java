import java.util.Scanner;

public class WeighingTheStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            int n = sc.nextInt();
            int[] countR = new int[101];
            int[] countA = new int[101];
            for (int i=0;i<n;i++) {
                int num = sc.nextInt();
                countR[num]++;
            }
            for (int i=0;i<n;i++) {
                int num = sc.nextInt();
                countA[num]++;
            }
            int maxR = Integer.MIN_VALUE, maxA = Integer.MIN_VALUE;
            int scoreR = 0, scoreA = 0;
            for (int i = 0; i < 101; i++) {
                if (countR[i] >= maxR) {
                    maxR = countR[i];
                    scoreR = i;
                }
            }
            for (int i = 0; i < 101; i++) {
                if (countA[i] >= maxA) {
                    maxA = countA[i];
                    scoreA = i;
                }
            }
            if (scoreR > scoreA) {
                System.out.println("Rupam");
            } else if (scoreA > scoreR) {
                System.out.println("Ankit");
            } else {
                System.out.println("Tie");
            }
            t--;
        }
    }
}
