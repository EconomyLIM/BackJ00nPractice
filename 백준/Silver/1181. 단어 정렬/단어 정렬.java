import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s[] = new String[n];
		for (int i = 0; i < s.length; i++) {
			s[i] = br.readLine();

		} // for
		
		Arrays.sort(s, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}else {
					return s1.length()-s2.length();
				} //if else
			} // compare
		}); // sort
		
		StringBuilder sb = new StringBuilder();
		sb.append(s[0]).append("\n");
		for (int i = 1; i < s.length; i++) {
			if (!s[i].equals( s[i-1] )) {
				sb.append(s[i]).append("\n");
			}//if
		} // for
		System.out.println(sb);
	} //main
} // class
