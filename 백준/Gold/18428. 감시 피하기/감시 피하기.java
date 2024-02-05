import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static final int dx[] = {-1, 0, 1, 0};
	static final int dy[] = {0, 1, 0, -1};
	static char map[][];
	static boolean visited[][]; 
	static int n;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		map= new char[n][n];
		visited = new boolean[n][n];
		
		for (int i = 0; i < map.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < map[0].length; j++) {
				map[i][j] = st.nextToken().charAt(0);
			} // for
			
		} // for
		
		dfs(0);
		System.out.println("NO");
	} // main
	
	public static void dfs(int count) {
		if (count == 3) {
			if ( bfs() ) {
				System.out.println("YES");
				System.exit(0);
			}
			
			return;
		}
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				if(map[i][j] == 'X') {
					map[i][j] = 'O';
					dfs(count + 1);
					map[i][j] = 'X';
				}
			} //for
		} // for
		 
	} //dfs
	
	public static boolean bfs() {
		
		char [][] copy = new char[n][n];
		Queue<int []> queue = new LinkedList<>();
		
		for (int i = 0; i < copy.length; i++) {
			for (int j = 0; j < copy[0].length; j++) {
				copy[i][j] = map[i][j];
				if(map[i][j] == 'T') {
					queue.add(new int[] {i, j});
				}
			}
		}
		
		while ( !queue.isEmpty() ) {
			int current[] = queue.poll();
			int cx = current[0];
			int cy = current[1];
	
			for (int i = 0; i < 4; i++) {
				int mx = cx;
				int my = cy;

				while (true) {
					mx += dx[i];
					my += dy[i];
					
					if (mx < 0 || mx >= map.length || my < 0 || my >= map[0].length) {
						break;
					}
					if(copy[mx][my] == 'O') break;
					
					if(copy[mx][my] == 'S') return false;
				}
			}
		}
		return true;
	} // bfs
} // class
