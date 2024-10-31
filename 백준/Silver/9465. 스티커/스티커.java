import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int n;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int [][] arr;
        int [][] dp;
        for (int i = 0; i < T; i++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[2][n + 1];
            dp = new int[2][n + 1];

            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[0][j] = Integer.parseInt(st.nextToken());
            } // for

            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[1][j] = Integer.parseInt(st.nextToken());
            } // for

            dp[0][1] = arr[0][1];
            dp[1][1] = arr[1][1];

            for (int j = 2; j <= n; j++) {
                dp[0][j] = Math.max(dp[1][j-1], dp[1][j-2]) + arr[0][j];
                dp[1][j] = Math.max(dp[0][j-1], dp[0][j-2]) + arr[1][j];
            } // for

            sb.append(Math.max(dp[0][n], dp[1][n]))
                    .append("\n");
        } // for

        System.out.println(sb.toString());
    }
}