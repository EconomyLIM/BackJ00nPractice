import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int [n+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1 ; i <= n ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n+1];
        int dpSum = 0;
        for (int i = 1; i < arr.length; i++) {
            dpSum += arr[i];
            dp[i] = dpSum;
        }

        StringBuilder sb = new StringBuilder();
        int a , b, sum = 0;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sum = 0;

            sum = dp[b] - dp[a-1];

            sb.append(sum).append("\n");
        } // for

        System.out.println(sb.toString());
    }
}