import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> under = new PriorityQueue<>(  );
		PriorityQueue<Integer> over = new PriorityQueue<>( (o1, o2)-> o2-o1 );
		int temp;
		for (int i = 0; i < n; i++) {
			temp = Integer.parseInt(br.readLine());
			if(temp > 0) over.add(temp);
			else under.add(temp);
		} // for
		
		int sum = sum(over) + sum(under);
		
		System.out.println(sum);
		
	} // main
	
	public static int sum(PriorityQueue<Integer> queue) {
		int sum = 0;
		while (queue.size() > 0) {
			if (queue.size() == 1) {
				sum+= queue.poll();
				break;
			}
			
			int first = queue.poll(); 
			int end = queue.poll();
			
			int multiply = first * end;
			if (multiply > (first + end) ) {
				sum+= multiply;
			}else {
				sum += first;
				queue.offer(end);
			}
		} // while
		return sum;
	} //sum
}