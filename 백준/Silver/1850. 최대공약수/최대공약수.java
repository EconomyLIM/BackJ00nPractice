import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Long a = Long.valueOf(st.nextToken());
		Long b = Long.valueOf(st.nextToken());
		
		Long mod = gcd(a, b);
	
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < mod; i++) {
			sb.append("1");
		}
		
		System.out.println(sb.toString());
	} // main
	
	public static long gcd(long a, long b) {
		if(b == 0) return a;
		
		return gcd(b, a%b);
	}
}