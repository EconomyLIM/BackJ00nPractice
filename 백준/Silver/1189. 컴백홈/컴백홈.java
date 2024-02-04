import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer> list = new ArrayList<>();
	static int visited[][];
	static int maps[][];
	
	static int [] dx = {-1, 0, 1, 0};
	static int [] dy = {0, 1, 0, -1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		maps = new int[r][c];
		visited = new int [r][c];
		
		String line;
		for (int i = 0; i < maps.length; i++) {
			line = br.readLine();
			for (int j = 0; j < maps[0].length; j++) {
				if(line.charAt(j) == '.') {
					maps[i][j] = 1;
				}
				else {
					maps[i][j] = 0;
				} //else
			} // for
		} //for
		
		visited[r-1][0] = 1;
		dfs(r-1, 0, 0, c-1);
		
		int cnt = 0;
		for (int i : list) {
			if(i == k)
				cnt++;
		}
		System.out.println(cnt);
		
	} // main
	public static void dfs(int cx, int cy, int gx, int gy) {
		
		if (cx == gx && cy == gy) {
			list.add(visited[cx][cy]);
			return;
		}
		
		for (int i = 0; i < 4; i++) {
			int mx = cx + dx[i];
			int my = cy + dy[i];
			
			if(mx < 0 || mx >= maps.length || my < 0 || my >= maps[0].length)
				continue;
			
			if(maps[mx][my] == 1 && visited[mx][my] == 0) {
				visited[mx][my] = visited[cx][cy] + 1;
				dfs(mx, my, gx, gy);
				visited[mx][my] = 0;
			} // if
			
		}
		
	} //dfs
	
} // class