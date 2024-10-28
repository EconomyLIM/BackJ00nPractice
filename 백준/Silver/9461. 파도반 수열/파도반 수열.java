import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final int N = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        long [] dp = new long[N];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        dp[4] = 2;
        for (int i = 5; i < N; i++) {
            dp[i] = dp[i-2] + dp[i-3];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            sb.append(dp[Integer.parseInt(br.readLine()) - 1]).append("\n");
        }

        System.out.println(sb.substring(0, sb.length() - 1));
    }
}