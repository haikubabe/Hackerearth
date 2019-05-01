import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxSubarray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());
        long[] a = new long[n];
        StringTokenizer stringTokenizer1 = new StringTokenizer(bufferedReader.readLine());
        int i=0;
        while (stringTokenizer1.hasMoreTokens()) {
            a[i] = Integer.parseInt(stringTokenizer1.nextToken());
            i++;
        }
        for (int j=0;j<n;j++) {
            long max=a[j];
            if (j+k>n) {
                break;
            }
            for (int l=j+1;l<j+k;l++) {
                if (a[l]>max) {
                    max = a[l];
                }
            }
            System.out.print(max + " ");
        }
        System.out.println();
    }
}
