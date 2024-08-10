import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	private static int[] dx = {-1, 0, 1, 0};
	private static int[] dy = {0, 1, 0, -1};
	
	public static int map [][];
	public static boolean visited[][];
	
	static Queue<int []> queue;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		List<Integer> list = new ArrayList<>();
		int m, n, k; 
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			
			map = new int[m][n];
			visited = new boolean[m][n];
			queue = new LinkedList<int[]>();
			
			for (int j = 0; j < k; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				map[x][y] = 1;
			}
			
			int cnt = 0;
			for (int j = 0; j < map.length; j++) {
				for (int z = 0; z < map[0].length; z++) {
					if(!visited[j][z] && map[j][z] == 1) {
						bfs(j, z);
						cnt++;
					}
				} //for
			} // for
			
			list.add(cnt);
		}
		for (int i : list) {
			System.out.println(i);
		}
	} // main
	public static void bfs(int x, int y) {
		queue.add(new int[] {x,y});
		visited[x][y] = true;
		
		while (!queue.isEmpty()) {
			int current[] = queue.poll();
			int cx = current[0];
			int cy = current[1];
			
			for (int i = 0; i < 4; i++) {
				int mx = cx + dx[i];
				int my = cy + dy[i];
				
				if (mx < 0 || mx >= map.length || my < 0 || my >= map[0].length) {
					continue;	
				}
				
				if (!visited[mx][my] && map[mx][my] == 1) {
					queue.add(new int[] {mx,my});
					visited[mx][my] = true;
				}
			}
			
		}
	}
}