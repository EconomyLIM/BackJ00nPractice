import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int temp[] = new int[n];
		int max = 0;
		for (int i = 0; i < temp.length; i++) {
			int a = Integer.parseInt(br.readLine());
			if(max < a) {
				max = a;
			}
			temp[i] = a;
		} // for
		
		int [] dp = new int[max + 1];
		
		dp[1] = 3;
		dp[2] = 5;
		
		int cnt;
		for (int i = 3; i < dp.length; i++) {
			cnt = 0;
			for(int j = 1 ; j < i ; j++) {
				cnt += (gcd(i, j) == true) ? 1: 0;
			}
			dp[i] = dp[i-1] + 2 * cnt;
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < temp.length; i++) {
			sb.append(dp[ temp[i] ]).append("\n");
		}
		
		System.out.println(sb.substring( 0, sb.length()-1 ).toString());
		
	}
	
	public static boolean gcd(int x, int y) {
		if(y==0) return x==1;
		return gcd(y, x%y);
	} // gcd
}