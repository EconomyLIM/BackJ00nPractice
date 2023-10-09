import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		char ch[][] = new char[8][8];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = 0;
		for (int i = 0; i < ch.length; i++) {
			String ans = br.readLine();
			for (int j = 0; j < ch[0].length; j++) {
				ch[i][j] = ans.charAt(j);
				
				if ((i+j)%2 == 0 && ch[i][j] =='F') {
					cnt++;
				}
				
			} //for
			
		} //for
		System.out.println(cnt);
	}
}