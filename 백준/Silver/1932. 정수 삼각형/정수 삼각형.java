import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		
		int map[][] = new int [length][length];
		
		String [] temp = null;
		for (int i = 0; i < map.length; i++) {
			temp = br.readLine().split(" ");
			for (int j = 0; j < temp.length; j++) {
				map[i][j] = Integer.parseInt(temp[j]);
			} // for
			
		} // for
		
		int dp[][] = new int[length][length];
		
		dp[0][0] = map[0][0];
		
		for (int i = 1; i < map.length; i++) {
			dp[i][0] = dp[i-1][0] + map[i][0];
			for (int j = 1; j < map[i].length; j++) {
				dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + map[i][j];
			}
			
		}
		
		int answer = 0;
		for (int i = 0; i < length; i++) {
			answer = Math.max(answer, dp[length-1][i]);
		}
		System.out.println(answer);
		
		
	}
}