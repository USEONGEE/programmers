import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine().trim());
        int[] input = new int[num + 2];
        int[] dp = new int[num + 2];
        for (int i = 1; i <= num; i++) input[i] = Integer.parseInt(br.readLine().trim());
        dp[1] = input[1];
        dp[2] = input[2] + dp[1];
        for (int i = 3; i <= num; i++) {
            int a = dp[i - 2] + input[i];
            int b = dp[i - 3] + input[i - 1] + input[i];
            dp[i] = Math.max(a, b);
        }
        System.out.println(dp[num]);
    }
}

