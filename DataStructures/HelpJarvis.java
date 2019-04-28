import java.util.Arrays;
import java.util.Scanner;

public class HelpJarvis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            String s = sc.next();
            char[] c = s.toCharArray();
            boolean flag = true;
            Arrays.sort(c);
            for (int i=1;i<s.length();i++) {
                int first = Character.getNumericValue(c[i-1]);
                int second = Character.getNumericValue(c[i]);
                if (second-first == 0 || second-first > 1) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }
}
