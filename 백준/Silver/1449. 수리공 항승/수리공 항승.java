import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		
		int [] temp = new int [n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < temp.length; i++) {
			temp[i] = Integer.parseInt(st.nextToken());
		} // for
		
		Arrays.sort(temp);
		int cnt = 0;
		int length = 0;
		
		for (int i = 0; i < temp.length; i++) {
			
			if(length >= temp[i]) continue;
			else {
				length = temp[i] + l - 1;
				cnt++;
			}
			
		} // for

		System.out.println(cnt);
	}
}