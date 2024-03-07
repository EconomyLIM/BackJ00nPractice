import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int a = 666;
		String temp = "";
		while (n != cnt) {
			temp = String.valueOf(a);
			if(temp.contains("666")) {
				cnt++;
			}
			a++;
		}
		
		System.out.println(temp);
		
	} // main
}