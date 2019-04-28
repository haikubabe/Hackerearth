import java.util.Scanner;
import java.util.Stack;

public class NeutralisationCharges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        stack.push(c[0]);
        for (int i=1;i<n;i++) {
            stack.push(c[i]);
            if (stack.size()>=2) {
                char last = stack.pop();
                char secondLast = stack.pop();
                if (last != secondLast) {
                    stack.push(secondLast);
                    stack.push(last);
                }
            }
        }
        System.out.println(stack.size());
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        System.out.println(stringBuilder.reverse());
    }
}
