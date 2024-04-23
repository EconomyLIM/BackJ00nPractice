import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long [] dp = new long[1000001];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i < dp.length; i++) {
            dp[i] = (dp[i-1] + dp[i-2] + dp[i-3]) % 1000000009;
        }

        StringBuilder sb = new StringBuilder();
        int temp;
        for (int i = 0; i < n; i++) {
            temp = Integer.parseInt(br.readLine());
            sb.append(dp[temp]).append("\n");
        }

        System.out.println(sb.toString());
    }
}