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
	
	static boolean visited[][];
	static int map [][];
	static int answer = 0;
	static boolean today = false;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		
		visited = new boolean[N][N];
		map = new int[N][N];
		String line[];
		for (int i = 0; i < map.length; i++) {
			line = br.readLine().split(" ");
			for (int j = 0; j < map.length; j++) {
				map[i][j] = Integer.parseInt(line[j]);
			} //for
		} // for
		int cnt = 0;

		while (true) {
			visited = new boolean[N][N];
			today = false;
			for (int i = 0; i < map.length; i++) {
				
				for (int j = 0; j < map.length; j++) {
					if(!visited[i][j]) {
						bfs(i, j, L, R);
						
					}//if
				} //for
			} //for
			
			if (!today) {
				break;
			}else {
				answer++;
			}
		}
		
		System.out.println(answer);
	} // main
	
	public static void bfs(int x, int y, int L, int R) {
		Queue<int []> queue = new LinkedList<>();
		ArrayList<int []> list = new ArrayList<>();
		
		queue.add(new int[] {x, y});
		visited[x][y]= true;
		int sum = 0;
		int cnt = 0;
		
		while ( !queue.isEmpty() ) {
			int current[] = queue.poll();
			int cx = current[0];
			int cy = current[1];
			
			sum += map[cx][cy];
			cnt ++;
			list.add(new int[] {cx, cy});
			
			for (int i = 0; i < 4; i++) {
				int mx = cx + dx[i];
				int my = cy + dy[i];
				if(mx < 0 || mx >= map.length || my < 0 || my >= map[0].length) {
					continue;
				}
				
				int difference = Math.abs(map[cx][cy] - map[mx][my]);
				
				if ( !visited[mx][my] && L <= difference && difference <= R ) {
					visited[mx][my] = true;
					today = true;
					queue.add(new int[] {mx, my});
				}// if
				
			} // for
		} //  while
		
		int divide = sum / cnt;
		
		int past[];
		for (int i = 0; i < list.size(); i++) {
			past = list.get(i);
			map[past[0]][past[1]] = divide;
		} // for

	} // bfs

}