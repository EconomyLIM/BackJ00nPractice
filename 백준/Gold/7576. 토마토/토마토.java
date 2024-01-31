import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int [] dx = {-1,0,1,0};
	static int [] dy = {0,-1,0,1};
	static int [][] maps;
	static int [][] visited;
	static int startX, startY;
	static ArrayList<int []> list = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		maps = new int[m][n];
		visited = new int[m][n];
		
		String line[];
		for (int i = 0; i < maps.length; i++) {
			line = br.readLine().split(" ");
			for (int j = 0; j < line.length; j++) {
				maps[i][j] = Integer.parseInt(line[j]);
				if (maps[i][j] == 1) {
					list.add(new int[] {i, j} );
				} //if
			} // for
		} // for
		
		bfs(list);
		
		int max = Integer.MIN_VALUE;
		boolean all = false;
		
		for (int i = 0; i < maps.length; i++) {
			for (int j = 0; j < maps[0].length; j++) {
				
				if (visited[i][j] == 0 && maps[i][j] == 0) {
					all = true;
				}

				max = Math.max(max, visited[i][j]);
			}
		}
		if (all) {
			System.out.println(-1);
		}else {
			System.out.println(max);
		}
	} // main
	
	public static void bfs(ArrayList<int[]> list) {
		
		Queue<int []> queue = new LinkedList<>();
		
		for (int[] array : list) {
			queue.add(array);
		}
		
		while (!queue.isEmpty()) {
			int current[] = queue.poll();
			int cx = current[0];
			int cy = current[1];
			
			for (int i = 0; i < 4; i++) {
				int mx = cx + dx[i];
				int my = cy + dy[i];
				
				if (mx < 0 || mx >= maps.length || my < 0 || my >= maps[0].length) {
					continue;
				}
				
				if (visited[mx][my] == 0 && maps[mx][my] == 0) {
					visited[mx][my] = visited[cx][cy] +1;
					queue.add(new int[] {mx, my});
				} //if
				
			} // for
			
		} // while

	} // bfs
} // class