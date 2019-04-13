import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MemoriseMe {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        int[] a = new int[n];
        int[] count = new int[1001];
        String[] str = bufferedReader.readLine().split("\\s+");
        for (int i=0;i<n;i++) {
            a[i] = Integer.parseInt(str[i]);
            count[a[i]]++;
        }
        int q = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        PrintWriter out = new PrintWriter(System.out, true);
        for (int i=0;i<q;i++) {
            int queries = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
            if (count[queries] == 0) {
                out.println("NOT PRESENT");
            } else {
                out.println(count[queries]);
            }
        }

    }
}
