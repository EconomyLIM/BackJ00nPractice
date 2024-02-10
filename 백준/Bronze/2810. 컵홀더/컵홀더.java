import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String s = br.readLine();
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) =='S') {
				str += "*S";
			}else {
				str += "*LL";
				i++;
			} // if else
		} // for
		str += "*";
		
		int cnt =0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '*') {cnt++;}
		}
		
		int answer = Math.min(N, cnt);
		System.out.println(answer);
		
	}
}