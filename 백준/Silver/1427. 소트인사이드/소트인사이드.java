
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		char c [] = new char[s.length()];
		for (int i = 0; i < c.length; i++) {
			c[i] = s.charAt(i);
		} // for
		
		int m[] = new int[c.length];
		for (int i = 0; i < m.length; i++) {
			m[i] = c[i] -'0';
		}
		Arrays.stream(m).boxed().sorted(Collections.reverseOrder()).forEach(System.out::print);
		
	} //main
} // class
