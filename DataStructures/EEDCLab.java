import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EEDCLab {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] a = new int[n];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int i=0, sum=0;
        while (i<n && stringTokenizer.hasMoreTokens()) {
            a[i] = Integer.parseInt(stringTokenizer.nextToken());
            sum += a[i];
            i++;
        }
        int[] count = new int[n];
        for (int j=0;j<n;j++) {
            int num = sum-a[j];
            if (num%30 == 0) {
                count[j]=1;
            }
        }
        int q = Integer.parseInt(bufferedReader.readLine());
        while (q>0) {
            StringTokenizer stringTokenizer1 = new StringTokenizer(bufferedReader.readLine());
            int l = Integer.parseInt(stringTokenizer1.nextToken());
            int r = Integer.parseInt(stringTokenizer1.nextToken());
            int ans=0;
            for (int k=l;k<=r;k++) {
                if (count[k-1] == 1) {
                    ans++;
                }
            }
            System.out.println(ans);
            q--;
        }
    }
}
