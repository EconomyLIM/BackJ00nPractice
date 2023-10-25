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
		int i = 1, sum = 0, count =1;
		while (true) {
			
			for (int j = 1; j <=i; j++) {
				if (count<n) {
					count++;
					continue;
				}else {
					sum +=i;
					if (count == m) {
						System.out.println(sum);
						return;
					} //if
					count++;
				} //if else
			} //for
			i++;
		} // while
	} //main
} // class