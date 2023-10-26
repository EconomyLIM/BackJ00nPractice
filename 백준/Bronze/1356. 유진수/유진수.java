import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int m[] = new int[s.length()];
		for (int i = 0; i < m.length; i++) {
			m[i] = s.charAt(i) -'0';
		} // for
		
		boolean sw = true;
		int left = 1, right = 1;

		for (int i = 0; i < m.length-1; i++) {
			left *= m[i];
			for (int j = i+1; j < m.length; j++) {
				right *=m[j];
			} //for
			
			if (left == right) {
				System.out.println("YES");
				sw = false;
				return;
			}//if
			
			right = 1;
		} // for
		if (sw) {
			System.out.println("NO");
		}
	} //main
} //class