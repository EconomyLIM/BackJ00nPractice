import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		
		int numbers[] = new int[l];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		int n = Integer.parseInt(br.readLine());
		
		Arrays.sort(numbers);
				
		
		// numbers[]안에서 제일 가까운 수 찾기
		int temp = 0;
		int start = 0;
		int end = Integer.MAX_VALUE;
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] > n) {
				if(numbers[i] < end)
				end = numbers[i];
			}else if(numbers[i] < n) {
				if(start < numbers[i])
				start = numbers[i];
			} 
			
			else if(numbers[i] == n){ // 만약 갖고 있다면 break;
				System.out.println("0");
				System.exit(0);
			}
		}
		
		int cnt = 0;
		
		for (int i = start + 1; i <= n ; i++) {
			for (int j = n; j <= end-1; j++) {
				if(i != j) cnt++;
			}
		}
		
		System.out.println(cnt);
		
	} // main
}