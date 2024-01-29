import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
	
	static final int dx [] = {-1, 0, 1, 0};
	static final int dy [] = {0, 1, 0, -1};
	
	static int visited[][];
	static int [][] map;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =  new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		visited = new int[n][m];
		map = new int[n][m];
		
		for (int i = 0; i < n ; i++) {
			String line = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = line.charAt(j) - '0';		
			}
		}
		bfs();
		
		System.out.println(visited[n-1][m-1]);
		
	} // main
	
	public static void bfs() {
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.add(new int[] {0,0});
		visited[0][0] = 1;
		
		while ( !queue.isEmpty() ) {
			int current[] = queue.poll();
			int cx = current[0];
			int cy = current[1];
			
			for (int i = 0; i < 4; i++) {
				int mx = cx + dx[i];
				int my = cy + dy[i];
				
				if(mx < 0 || mx >= map.length || my < 0 || my >= map[0].length)
					continue;
				if(visited[mx][my] == 0 && map[mx][my] == 1) {
					visited[mx][my] = visited[cx][cy] + 1;
					queue.add(new int[] {mx,my});
				} // if
				
				
			} //for
			
		} // while
	} // bfs

}