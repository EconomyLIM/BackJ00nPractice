import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a1 = Integer.parseInt(st.nextToken());
		int b1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int a2 = Integer.parseInt(st.nextToken());
		int b2 = Integer.parseInt(st.nextToken());
		
		int up = a1 * b2 + a2 * b1;
		int down = b1 * b2;
		
		int mod = gcd(up, down);
		
		System.out.printf("%d %d", up/mod , down/mod);
		
	}
	
	public static int gcd(int a, int b) {
		if(b == 0) return a;
		
		return gcd(b, a%b);
		
	}
}