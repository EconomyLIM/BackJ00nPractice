import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int dx[] = {-1, 0, 1, 0};
	static int dy[] = {0, 1, 0, -1};
	static int [][] map ;
	static boolean [][] visited;
	static int n;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		map = new int [n][n];
		visited = new boolean[n][n];
		StringTokenizer st;
		for (int i = 0; i < map.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < map[0].length; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			} // for
		} // for
		int cnt = 0;
		int max = Integer.MIN_VALUE;
		for (int height = 0; height < 101; height++) {
			cnt = 0;
			visited = new boolean[n][n];
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[0].length; j++) {
					if( !visited[i][j] && map[i][j] > height) {
						bfs(i, j, height);
						cnt++;
					}
				} // for 
			} // for
			if (max < cnt) {
				max = cnt;
			}
		} // for
		
		
		System.out.println(max);
	}
	public static void bfs(int x, int y, int height) {
		Queue<int []> queue = new LinkedList<int[]>();
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		
		while ( !queue.isEmpty() ) {
			int current[] = queue.poll();
			int cx = current[0];
			int cy = current[1];
			
			for (int i = 0; i < 4; i++) {
				int mx = cx + dx[i];
				int my = cy + dy[i];
				
				if(mx < 0 || mx >= map.length || my < 0 || my >= map[0].length)
					continue;
				
				if (map[mx][my] > height && !visited[mx][my]) {
					queue.add(new int[] {mx, my});
					visited[mx][my] = true;
				} // if
				
			} //for
			
		} //while
		
	} // bfs
}