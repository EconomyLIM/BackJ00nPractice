import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static final int money[] = {500, 100 ,50 , 10 , 5 , 1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		n = 1000 - n;
		int temp = 0;
		for (int i = 0; i < money.length; i++) {
			temp += n / money[i];
			n = n % money[i];
		}
		
		System.out.println(temp);
	}
}