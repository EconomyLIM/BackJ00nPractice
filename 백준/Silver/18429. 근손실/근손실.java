import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int temp [] ;
	static boolean visited[];
	static int k;
	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		temp = new int [n];
		visited = new boolean[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < temp.length; i++) {
			temp[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < temp.length; i++) {
			visited[i] = true;
			dfs(500, 0);
			visited[i] = false;
		}

		System.out.println(count);
		
	} // main
	
	public static void dfs(int weight, int depth) {
		
		if (weight < 500) {
			return;
		}
		
		if (depth == temp.length -1) {
			count++;
			return;
		}
		
		for (int i = 0; i < temp.length; i++) {
			if(!visited[i]) {
				visited[i] = true;
				dfs(weight + temp[i] - k, depth + 1);
				visited[i] = false;
			} //if

		} // for
		
	} //dfs
}