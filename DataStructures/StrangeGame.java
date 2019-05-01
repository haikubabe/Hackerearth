import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StrangeGame {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t>0) {
            String[] str = bufferedReader.readLine().split("\\s+");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
            int[] alice = new int[n];
            int[] bob = new int[n];
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i=0;
            while (i<n && stringTokenizer.hasMoreTokens()) {
                alice[i] = Integer.parseInt(stringTokenizer.nextToken());
                i++;
            }
            int max = Integer.MIN_VALUE;
            StringTokenizer stringTokenizer1 = new StringTokenizer(bufferedReader.readLine());
            int j=0;
            while (j<n && stringTokenizer1.hasMoreTokens()) {
                bob[j] = Integer.parseInt(stringTokenizer1.nextToken());
                if (bob[j]>max) {
                    max = bob[j];
                }
                j++;
            }
            long time=0;
            for (int p=0;p<n;p++) {
                if (alice[p]<=max) {
                    time += (max+1-alice[p]);
                }
            }
            System.out.println(time*k);
            t--;
        }
    }
}