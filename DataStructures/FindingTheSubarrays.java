import java.util.Scanner;

public class FindingTheSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        double cumSum=0;
        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
            cumSum += a[i];
        }
        int count=0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<n;i++) {
            double sum=0;
            int k=1;
            for (int j=i;j<n;j++) {
                sum += a[j];
                double avgSum = sum/k;
                double sumRem = cumSum-sum;
                int countRem = n-k;
                if (countRem == 0) {
                    countRem = 1;
                }
                double avgRemSum = sumRem/countRem;
                if (avgSum>avgRemSum) {
                    count++;
                    stringBuilder.append((i+1) + " " + (j+1) + "\n");
                }
                k++;
            }
        }
        System.out.println(count);
        System.out.print(stringBuilder.toString());
    }
}
