import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    
    static final int MAX = 31; 
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        int [][] dp = new int[MAX][MAX];
        
        // init 
        init(dp);

        // dp impl
        dpImpl(dp);

        // input
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            sb.append(dp[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]).append("\n");
        }

        System.out.println(sb.toString().substring(0, sb.toString().length() - 1));
    }

    private static void dpImpl(int[][] dp) {
        for (int i = 2; i < MAX; i++) {
            for (int j = i+1; j < MAX; j++) {
                dp[i][j] = dp[i][j-1] + dp[i-1][j-1];
            }
        }
    }

    private static void init(int[][] dp) {
        for (int i = 0; i < MAX; i++) {
            dp[1][i] = i;
            dp[i][i] = 1;
        } // for
    }
}