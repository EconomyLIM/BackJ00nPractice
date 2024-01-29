import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st ;
		
		Integer a [] = new Integer[n];
		Integer b [] = new Integer[n];
		
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < a.length; j++) {
				a[j] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < a.length; j++) {
				b[j] = Integer.parseInt(st.nextToken());
			}

		Arrays.sort(a);
		Arrays.sort(b, Collections.reverseOrder());
		
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			
			sum += a[i] * b[i];
			
		}
		
		System.out.println(sum);
	} // main
}