import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int stick = 64;
		
		int count = 0;
		while (x>0) {
			if (stick>x) {
				stick/=2;
			}else {
				count++;
				x -=stick;
			}
		
		} //while
		System.out.println(count);
	} //main
} //class