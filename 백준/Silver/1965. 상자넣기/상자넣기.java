import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int [] map = new int[n];
        int [] dp = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < map.length ;  i++) {
            map[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if(map[i] > map[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            } // for
            answer = Math.max(answer,dp[i]);
        } // for

        System.out.println(answer);

    }
}