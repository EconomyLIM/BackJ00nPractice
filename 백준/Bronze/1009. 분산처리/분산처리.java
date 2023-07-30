import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
	
		
		for (int i = 0; i < T; i++) {
			int a= scanner.nextInt();
			int b =scanner.nextInt();
			int result = 1;
			for (int j = 1; j <= b; j++) {
				result = result*a%10;
			}
			
			result = result ==0?10:result;
			System.out.println(result);
		} // for
		
		scanner.close();
	} 
}
