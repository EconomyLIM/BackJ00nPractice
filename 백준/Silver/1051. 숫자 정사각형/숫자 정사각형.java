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
		int z[][] = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < m; j++) {
				z[i][j] = s.charAt(j) - '0';
			}//for
		} //for
		int width = Math.min(n, m);
		while (width > 1) {
			for (int i = 0; i <= n-width ; i++) {
				for (int j = 0; j <= m-width ; j++) {
					if ( (z[i][j] == z[i+width-1][j]) && ( z[i][j] == z[i][j+width-1]) && (z[i][j] == z[i+width-1][j+width-1]) ) {
						System.out.println(width*width);
						return;
					} //if
				} // for
			} // for
			width--;
		} //while
		System.out.println(width);
	} //main
} //class
