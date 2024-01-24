import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static final int [] dx = {-1, 0, 1, 0};
	static final int [] dy = {0, 1, 0, -1};
	static int tempX ;
	static int tempY ;
	static boolean visitedBoolean [][];
	static int [][] maps, visited; 
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		
		maps = new int [n][m];
		visitedBoolean = new boolean[n][m];
		
		for (int i = 0; i < maps.length; i++) {
			StringTokenizer line = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < maps[0].length; j++) {
				maps[i][j] = Integer.parseInt(line.nextToken());
				
				if(maps[i][j] == 2) {
					tempX = i;
					tempY = j;
				}  // if
				
			} // for
			
		} // for
		
		visited = new int [n][m];
		
		bfs(maps, visited);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < visited.length; i++) {
			 
			for (int j = 0; j < visited[0].length; j++) {
				
			if(!visitedBoolean[i][j] && maps[i][j] == 1) {
				sb.append(-1).append(' ');
			} else{
			
				sb.append(visited[i][j]).append(' ');
			}// if else
				
			} // for
			
			sb.append('\n');
		} // for
		
		System.out.println(sb.toString());
		
	} // main
	
	public static void bfs(int [][] maps, int visited [][]) {
		
		Queue<int [] > queue = new LinkedList<>();
		queue.add(new int[] {tempX, tempY});
		
		while (!queue.isEmpty()) {
			int current[]= queue.poll();
			int cx = current[0];
			int cy = current[1];
			
			for(int i = 0 ; i < 4 ; i++) {
				int mx = cx + dx[i];
				int my = cy + dy[i];
				
				if (mx < 0 || mx > maps.length -1 || my < 0 || my > maps[0].length -1) {
					continue;
				} // if
				
				if (visited[mx][my] == 0 && maps[mx][my] == 1) {
					visited[mx][my] = visited[cx][cy] + 1;
					visitedBoolean[mx][my] = true;
					queue.add(new int [] {mx,my});
				} // if
				
				
			} // for
			
		} // while
		
	} // bfs
} // class