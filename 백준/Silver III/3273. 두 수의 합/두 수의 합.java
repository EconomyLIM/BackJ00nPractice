import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int arr[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int x = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		int start = 0;
		int end = n-1;
		long result = 0;
		while (start < end) {
			if (arr[start] + arr[end] == x) {
				result++;
				start++;
				end--;
			} else if (arr[start] + arr[end] > x) {
				end--;
			}else {
				start++;
			}
		} // while
		
		System.out.println(result);
		
	} // main
}