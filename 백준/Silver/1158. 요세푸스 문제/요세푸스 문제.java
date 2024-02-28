import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<>();
		
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		} // for
		int cnt = 1;
		ArrayList<Integer> list = new ArrayList<>();
		while ( !queue.isEmpty() ) {
			int temp = queue.poll();
			
			if (cnt == k) {
				cnt = 1;
				list.add(temp);
				continue;
			}
			cnt++;
			queue.add(temp);
		} // while
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		for (int i : list) {
			sb.append(i).append(", ");
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append(">");
		System.out.println(sb.toString());
		
	}
}