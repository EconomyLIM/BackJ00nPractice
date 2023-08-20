import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int m = scanner.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < m; i++) {
			
			list.add(scanner.nextInt());
		}
		list.sort(null);
		
		int n = list.get(0) * list.get(m-1);
		System.out.println(n);
		
	}
}