import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int left = 0;
		int right = 0;
		int cnt = 0;
		long sum = 0;
		long max = Integer.MIN_VALUE;
		
		for (; left <= n - k; left++) {
			while (cnt < k) {
				cnt++;
				sum += arr[right++];
				
			}
			if (cnt == k) {
				if (max < sum) {
					max = sum;
				}
				sum -= arr[left];
				cnt --;
			} //if
		} // for
		
		System.out.println(max);
	}
}