import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		int max;
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			max = 0;
			int num = i;
			for (int j = 2; j <= num ; j++) {
				while (num % j == 0) {
					
					num /= j;
					if(max < j) {
						max = j;
					}
				} // while
			} // for
			
			if(max <= k)
				cnt++;
			
		} //for
		
		System.out.println(cnt);
	} // main

}