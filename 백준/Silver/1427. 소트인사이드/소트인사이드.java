import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int m[] = new int[s.length()];
		for (int i = 0; i < m.length; i++) {
			m[i] = s.charAt(i)-'0';
		} // for
		
		for (int i = 0; i < m.length; i++) {
			int temp;
			for (int j = i+1; j < m.length; j++) {
				if (m[i] < m[j]) {
					temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}//if
			}// for
		} //for
		
		for (int i : m) {
			System.out.print(i);
		} //for
		
	} //main
} // class