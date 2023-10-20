import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String s[] = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = br.readLine();
		}
		HashSet<String> hs = new HashSet<>();
		for (int i = 1; i <= s[0].length(); i++) {
			for (int j = 0; j < n; j++) {
				hs.add(s[j].substring(s[0].length()- i));
			}
			if (hs.size() == n) {
				System.out.println(i);
				return;
			}
			hs.clear();
		}
	} // main
} // class