import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int []temp = new int[T];
        int [][] dp = new int [41][2];
        StringBuilder sb = new StringBuilder();

        init(T, temp, br, dp);
        extracted(T, temp, dp, sb);

        System.out.println(sb.toString());
    }

    private static void init(int T, int[] temp, BufferedReader br, int[][] dp) throws IOException {
        for (int i = 0; i < T; i++) {
            temp[i] = Integer.parseInt(br.readLine());
        }

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;
    }

    private static void extracted(int T, int[] temp, int[][] dp, StringBuilder sb) {
        for (int i = 0; i < T; i++) {
            for (int j = 2; j <= temp[i]; j++) {
                dp[j][0] = dp[j-1][0] + dp[j-2][0];
                dp[j][1] = dp[j-1][1] + dp[j-2][1];
            }
            sb.append(dp[temp[i]][0]).append(" ").append(dp[temp[i]][1]).append("\n");
        }
    }
}
