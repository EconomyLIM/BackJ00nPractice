import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long s = Long.valueOf(br.readLine());
		
		int start = 1;
		int end = 1;
		long sum =0;
		long cnt=0 ;
		while (true) {
			
			if (sum == s) {
				break;
			}else if (sum > s){
				cnt--;
				break;
			}
			
			if (sum < s) {
				sum+=end;
				end++;
				cnt ++;
			}
			
		} // while
		
		System.out.println(cnt);
	}
}
