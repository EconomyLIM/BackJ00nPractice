import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Long> queue = new PriorityQueue<>();
		
		for (int i = 0; i < n; i++) {
			queue.add(Long.valueOf(br.readLine()));
		} // for
		
		long sum = 0;
		while (queue.size() > 1) {
			long first = queue.poll();
			long second = queue.poll();
			
			sum += first + second;
			
			queue.add(first + second);
			
		} //while
		
		System.out.println(sum);
			
	}
}