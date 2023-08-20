import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int pkgPri [] = new int [n];
		int onePri [] = new int [n];
		for (int i = 0; i < n; i++) {
			pkgPri[i] = scanner.nextInt();
			onePri[i] = scanner.nextInt();
		}
		
		Arrays.sort(pkgPri);
		Arrays.sort(onePri);
		
		int min;
		min = Math.min(((m/6)+1)*pkgPri[0], onePri[0]*m);
		min = Math.min(min, ((m/6))*pkgPri[0] + (m%6)*onePri[0]);
		
		System.out.println(min);
	}
}
