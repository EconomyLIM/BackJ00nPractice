import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int x, y;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int temp[] = new int[n];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = Integer.parseInt(br.readLine());
		}

		int dp[][] = new int[41][2];
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < temp.length; i++) {
			for (int j = 2; j <= temp[i]; j++) {
				dp[j][0] = dp[j-1][0] + dp[j-2][0];  
				dp[j][1] = dp[j-1][1] + dp[j-2][1];  
			}
			sb.append(dp[temp[i]][0] + " " + dp[temp[i]][1] + "\n");
			
		}
		
		System.out.println(sb.toString());
		
	} // main

}