import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int n, m, k;
	static int lamps[][] = null;
	static int max = 0;
	static boolean[] visited = null;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		lamps = new int[n][m];
		
		
	
		for (int i = 0; i < lamps.length; i++) {
			String s = br.readLine();
			for (int j = 0; j < m; j++) {
				
				lamps[i][j] =s.charAt(j) - '0';
				
			} //for
			
		} // for
		k = Integer.parseInt(br.readLine());
		visited = new boolean[lamps.length];
		
		for (int i = 0; i < lamps.length; i++) {
			if (visited[i]) {
				continue;
			}//if
			
			visited[i] = true;
			
			int offlamp = 0;
			for (int lamp : lamps[i]) {
				if (lamp == 0) {
					offlamp++;
				} // if
			} // for
			
			int sameRowCnt = getSameRowcnt(i);
			if (offlamp % 2 == k % 2 && offlamp<=k) {
				max = Math.max(sameRowCnt, max);
			} //if
			
		} // for
		
		System.out.println(max);
		
	} // main
	
	static int getSameRowcnt(int r) {
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			
			if (Arrays.equals(lamps[i], lamps[r])) {
				cnt++;
				visited[i] = true;
			} //if
			
		} //for
		
		return cnt;
	} // getSameRowcnt
} //class