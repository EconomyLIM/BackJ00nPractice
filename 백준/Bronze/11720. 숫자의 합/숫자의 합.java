
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int i [] = new int [m];
		int sum = 0;
		String s = scanner.next();
		char c[] = new char[s.length()];
		for (int j = 0; j < s.length(); j++) {
			 c[j] = s.charAt(j);
			 i[j] = Character.getNumericValue(c[j]);
			 sum += i[j];
		}
		System.out.println(sum);
		
	}
}
