import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		if(n < 100) {
			System.out.println(n);
		}else {
			cnt = 99;
			for (int i = 100; i <= n; i++) {
				
				int one = i % 10;
				int ten = (i/10) % 10;
				int hundred = i / 100;
				
				if (( ten - one ) == ( hundred - ten )) {
					cnt++;
				}
				
			} // for
			System.out.println(cnt);
		}
		
	} // main
}
