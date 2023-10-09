import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s[] = new String[n];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String ans = scanner.next();
			if (n == 1) {
				System.out.println(ans);
				return;
			} //if
			else {
				s[i] = ans;
			} //else
		} // for
		boolean sw = true;
		for (int i = 0; i < s[0].length(); i++) {
			char c = s[0].charAt(i);
			for (int j = 1; j < n ; j++) {
				if(c != s[j].charAt(i)) sw = false;
			} // for
			if (sw) {
				sb.append(c);
			} else {
				sb.append("?");
			}
			sw = true;
		} //for
		System.out.println(sb);
	} //main
}