import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] temp = new int[n+1];
        int []dp = new int[n+1];

        for (int i = 1; i <= n; i++) {
            temp[i] = Integer.parseInt(br.readLine());
        } // for

        dp[1] = temp[1];
        if(n>= 2){
            dp[2] = temp[1] +temp[2];
        } // if

        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(temp[i-1] + dp[i-3], dp[i-2]) + temp[i];
        }
        System.out.println(dp[n]);
        
    }
}