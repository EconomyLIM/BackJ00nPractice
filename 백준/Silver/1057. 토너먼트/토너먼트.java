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
		int z = Integer.parseInt(st.nextToken());
		int count = 0;
		
		while (m != z) {
			m = m/2 + m%2;
			z = z/2 + z%2;
			count++;
		} // while
		
		System.out.println(count);
	} // main
} // class