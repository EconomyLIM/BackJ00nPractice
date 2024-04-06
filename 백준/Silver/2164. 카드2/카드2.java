import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> deque = new LinkedList<>();
		
		for (int i = 1 ; i <= n; i++) {
			deque.add(i);
		} // for
		
		boolean flag = true;
		int temp;
		while ( deque.size() != 1) {
			if (flag) {
				temp = deque.poll();
				flag = false;
			}else {
				temp = deque.poll();
				deque.offer(temp);
				flag = true;
			}
		} // while

		System.out.println(deque.poll());
	} // main
}