import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static final int dx[] = {-1, 0, 1, 0};
	static final int dy[] = {0, 1, 0, -1};
	static int maps[][] ;
	static boolean visited[][];
	static Queue<int[]> queue;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < T; i++) {
			// init
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			maps = new int[m][n];
			visited = new boolean[m][n];
			queue = new LinkedList<>();
			int cnt = 0;
			
			for (int j = 0; j < k; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				maps[x][y] = 1;
			}
			
			for (int j = 0; j < maps.length; j++) {
				for (int z = 0; z < maps[0].length; z++) {
					if(!visited[j][z] && maps[j][z] == 1) {
						bfs(j, z);
						cnt++;
					}
				} //for
			} // for
			
			list.add(cnt);
		} // for
		
		for (int i : list) {
			System.out.println(i);
		}
		
	} // main
	public static void bfs(int x, int y) {
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		
		while (!queue.isEmpty()) {
			int current[] = queue.poll();
			int cx = current[0];
			int cy = current[1];
			
			for (int i = 0; i < 4 ; i++) {
				int mx = cx + dx[i];
				int my = cy + dy[i];
				
				if (mx < 0 || mx >= maps.length || my < 0 || my >= maps[0].length) {
					continue;
				} // if
				if(!visited[mx][my] && maps[mx][my] == 1) {
					queue.add(new int[] {mx, my});
					visited[mx][my] = true;
				}
			} // for
		} // while
		
	} // bfs
} // class