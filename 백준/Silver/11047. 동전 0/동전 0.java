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
		
		int money[] = new int [n];
		for (int i = 0; i < money.length; i++) {
			money[i] = Integer.parseInt(br.readLine());
		} // for
		
		int cnt = 0;
		for(int i = money.length -1 ; i >= 0 ; i--) {
			cnt += m / money[i];
			m = m % money[i]; 
			
		} // for
		
		System.out.println(cnt);
	} // main
}