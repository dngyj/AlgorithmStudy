import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];
        int[] dp = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        dp[0] = arr[0];
        int ans = dp[0];

        for(int i=1;i<N;i++){
            dp[i] = Math.max(arr[i], dp[i-1]+arr[i]);
            ans = Math.max(ans, dp[i]);
        }
        System.out.println(ans);
    }
}