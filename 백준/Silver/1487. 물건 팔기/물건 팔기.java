import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int money[][] = new int [n][2];
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			money[i][0] = Integer.parseInt(st.nextToken());
			money[i][1] = Integer.parseInt(st.nextToken());
		} // for
		
		Arrays.sort(money, (o1, o2)-> o1[0] - o2[0]);
		
		int max = 0;
		long temp = 0, maxMoney = 0;
		for (int i = 0; i < money.length; i++) {
			temp = 0;
			for (int j = i; j < money.length; j++) {
				if(money[i][0] <= money[j][0]) {
					if (money[i][0] - money[j][1] > 0) {
						temp += money[i][0] - money[j][1];
					}
				} //if
			} // for
			
			if(temp > maxMoney) {
				maxMoney = temp;
				max = money[i][0];
			}
		}
		
		System.out.println(max);
	}
}