import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ans = br.readLine();
		
		int a[] = new int [26];
		char c [] = ans.toCharArray();
		char d [] = ans.toCharArray();
		for (int i = 0; i < c.length; i++) {
		
			a[Character.toUpperCase(c[i])-65]++;
			
		}
		int max = -1;
		char ch = '?';
		
		for (int i = 0; i < 26; i++) {
			if (a[i] > max) {
				max = a[i];
				ch = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
			}
			else if (a[i] == max) {
				ch = '?';
			}
		}//for
		System.out.println(Character.toUpperCase(ch));
		
	} //main
}//class