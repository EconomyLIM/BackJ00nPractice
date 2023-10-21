
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char castle[][] = new char[n][m];
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				castle[i][j] = str.charAt(j);
			} // for
		} // for
		
		boolean sw = true, sw2 = true;
		int x = 0, y = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (castle[i][j] == 'X') {
					sw = false;
				}
			} // for
			if (sw) {
				x++;
			}
			sw = true;
		} //for

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (castle[j][i] == 'X') {
					sw2 = false;
				}
			} // for
			if (sw2) {
				y++;
			}
			sw2 = true;
		} //for
		int z = Math.max(x, y);
		System.out.println(z);
	} //main
} // class
