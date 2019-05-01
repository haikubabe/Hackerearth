import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InterestingSubarray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t>0) {
            int n = Integer.parseInt(bufferedReader.readLine());
            int[] a = new int[n];
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i=0;
            while (i<n && stringTokenizer.hasMoreTokens()) {
                a[i] = Integer.parseInt(stringTokenizer.nextToken());
                i++;
            }
            int count = 0, max = 0;
            for (int j=0;j<n;j++) {
                if (a[j]%2==0) {
                    count++;
                } else {
                    max = count>max?count:max;
                    count=0;
                }
            }
            max = count>max?count:max;
            if (max == 0) {
                max = -1;
            }
            System.out.println(max);
            t--;
        }
    }
}
