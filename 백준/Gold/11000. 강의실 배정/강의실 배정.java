import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int classTime[][] = new int[n][2];
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		StringTokenizer st;
		
		for (int i = 0; i < classTime.length; i++) {
			st = new StringTokenizer(br.readLine());
			classTime[i][0] = Integer.parseInt(st.nextToken());
			classTime[i][1] = Integer.parseInt(st.nextToken());
			
		} // for
		
		Arrays.sort(classTime, (o1,o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.add(classTime[0][1]);
		for (int i = 1; i < classTime.length; i++) {
			if (queue.peek() <= classTime[i][0]) {
				queue.poll();
			}
			queue.add(classTime[i][1]);
		}
		
		System.out.println(queue.size());
		
	} // main
}