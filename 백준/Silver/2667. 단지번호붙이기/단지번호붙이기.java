import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static final int dx[] = {-1,0,1,0};
	static final int dy[] = {0,1,0,-1};
	static int [][] map;
	static boolean visited[][];
	static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		map = new int [n][n];
		visited = new boolean[n][n];
		String line[];
		for (int i = 0; i < n; i++) {
			line = br.readLine().split("");
			for (int j = 0; j < line.length; j++) {
				map[i][j] = Integer.parseInt(line[j]);
			} // for
		} // for
		
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				if( !visited[i][j] && map[i][j] == 1) {
					bfs(i, j);
				} // if
			} // for
		} //for
		
		Collections.sort(list);
		System.out.println(list.size());
		for (int i: list) {
			System.out.println(i);
		}
		
	}// main
	
	static void bfs(int x, int y) {
		Queue<int []> queue = new LinkedList<>();
		queue.add(new int[] {x, y});
		visited[x][y] = true;
		int sum = 0;
		while ( !queue.isEmpty() ) {
			int current[] = queue.poll();
			int cx = current[0];
			int cy = current[1];
			
			sum++;
			
			for (int i = 0; i < 4; i++) {
				int mx = cx + dx[i];
				int my = cy + dy[i];
				
				if (mx < 0 || mx >= map.length || my < 0 || my >= map[0].length) {
					continue;
				}
				
				if ( !visited[mx][my] && map[mx][my] == 1) {
					queue.add(new int[] {mx, my});
					visited[mx][my] = true;
				} //if
			} // for
			
		} // while
		list.add(sum);
	} // bfs
} //class