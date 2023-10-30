import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s [] = br.readLine().split(" ");
		HashSet<String> hs= new HashSet<>();
		for (int i = 0; i < n; i++) {
			hs.add(s[i]);
		} //for
		if (hs.size() >= n) {
			System.out.println(0);
		}else {
			System.out.println(n-hs.size());
		} //if else
	} //main
} // class