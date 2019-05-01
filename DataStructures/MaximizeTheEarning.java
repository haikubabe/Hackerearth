import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximizeTheEarning {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(bufferedReader.readLine());
        while (s>0) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int n = Integer.parseInt(stringTokenizer.nextToken());
            int r = Integer.parseInt(stringTokenizer.nextToken());
            int max = Integer.MIN_VALUE;
            int count = 0;
            StringTokenizer stringTokenizer1 = new StringTokenizer(bufferedReader.readLine());
            while (stringTokenizer1.hasMoreTokens()) {
                int h = Integer.parseInt(stringTokenizer1.nextToken());
                if (h>max) {
                    max = h;
                    count++;
                }
            }
            System.out.println(count*r);
            s--;
        }
    }
}
