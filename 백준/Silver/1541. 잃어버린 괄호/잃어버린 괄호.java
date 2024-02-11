import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		
		int sum = Integer.MAX_VALUE;
		int temp;
		while (st.hasMoreElements()) {
			temp = 0;
			
			StringTokenizer add = new StringTokenizer(st.nextToken(), "+");
			
			while (add.hasMoreElements()) {
				temp+= Integer.parseInt(add.nextToken());
			} // while
			
			if (sum == Integer.MAX_VALUE) {
				sum = temp;
			}else {
				sum-= temp;
			} // if else
			
		} //while
		
		System.out.println(sum);
	} // main
}