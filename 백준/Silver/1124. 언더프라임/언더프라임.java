import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		int under = 0;
		for (int i = a; i <= b; i++) {
			under = under(i);
			if (isPrime(under)) {
				cnt++;
			}
		} // for
		
		System.out.println(cnt);
	} // main

	public static int under(int num) {
		int cnt = 0;
		for(int i = 2; i <= num; i++) {
			while(num % i == 0) {
				cnt ++;
				num /= i;
			}
		}
		
		return cnt;
	}
	

	public static boolean isPrime(int num) {

		if (num < 2) {
			return false;
		}
		
		for(int i = 2 ; i <= (int) Math.sqrt(num) ; i++ ) {
			if(num % i == 0) {
				return false;
			}
		}

		return true;
	} // isPrime
}