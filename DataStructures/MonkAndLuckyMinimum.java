import java.util.Scanner;

public class MonkAndLuckyMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            int n = sc.nextInt();
            int min = Integer.MAX_VALUE;
            int count = 1;
            for (int i=0;i<n;i++) {
                int num = sc.nextInt();
                if (num<min) {
                    min = num;
                    count=1;
                } else if (num == min) {
                    count++;
                }
            }
            if (count%2==1) {
                System.out.println("Lucky");
            } else {
                System.out.println("Unlucky");
            }
            t--;
        }
    }
}
