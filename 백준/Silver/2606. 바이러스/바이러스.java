import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static boolean visited[];
	static int cnt = 0;
	static int n;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine()); // 컴퓨터 갯수
		int m = Integer.parseInt(br.readLine()); // 컴퓨터 연결 갯수
		int map[][] = new int [n+1][n+1];
		visited = new boolean[n+1];
		StringTokenizer st;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			map[x][y] = 1;
			map[y][x] = 1;
		} // for
        
		dfs(1, map);
        
		System.out.println(cnt);
	} // main
	static void dfs(int node, int [][] map) {
		visited[node] = true;
		
		for (int i = 1; i < n+1; i++) {
			if (map[node][i] == 1 && !visited[i]) {
				dfs(i, map);
				cnt++;
			} //if
		} // for
		
	} //dfs
}