import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int start,end;
	static int m;
	static int sum = 0;
	
	static boolean goal = false;
	static int map[][];
	static boolean visited[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		String line [] = br.readLine().split(" ");
		start = Integer.parseInt(line[0]);
		end = Integer.parseInt(line[1]);
		m = Integer.parseInt(br.readLine());
		
		map = new int[n+1][n+1];
		visited = new boolean[n+1];
		StringTokenizer st;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			map[x][y] = 1;
			map[y][x] = 1;
		} // for
		
		dfs(start, 0);
		if (goal) {
			System.out.println(sum);
		} else {
			System.out.println("-1");
		}
	}
	public static void dfs(int s, int depth) {
		
		if (s == end) {
			goal = true;
			sum = depth;
			return; 
		} // if
		visited[s] = true;
		
		for (int i = 0; i < n+1; i++) {
			if(!visited[i] && map[s][i] == 1)
			{
				
				dfs(i, depth + 1);
				
			} // if
		} // for
	} //dfs
}
