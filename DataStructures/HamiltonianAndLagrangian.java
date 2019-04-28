import java.util.Scanner;

public class HamiltonianAndLagrangian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<n-1;i++) {
            boolean flag=true;
            for (int j=i+1;j<n;j++) {
                if (arr[i]<arr[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                stringBuilder.append(arr[i] + " ");
            }
        }
        stringBuilder.append(arr[n-1]);
        System.out.println(stringBuilder.toString());
    }
}
