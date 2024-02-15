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
		
		int temp[] = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < temp.length; i++) {
			temp[i] = Integer.parseInt(st.nextToken());
		} // for
		
		long sum = 0; // 합
		long result = 0; // 결과 값
		int start = 0, end = 0; // 시작 종료
		
		while ( start < n) {
			if ( sum > m || end == n) {
				sum -= temp[start];
				start++;
			}else {
				sum += temp[end];
				end ++;
			}
			if (sum == m) {
				result++;
			}
		}
		
		System.out.println(result);
		
	} // main
} // class