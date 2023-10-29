import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int temp[] = new int[n];
		int count = 0;
		int max = 0, min = 0;
		for (int i = 0; i < n; i++) {
			temp[i] = Integer.parseInt(br.readLine());
			if (temp[i] > max) {
				max = temp[i];
				count++;
			}//if
		} // for
		System.out.println(count);
		count = 0;
		max =0;
		for (int i = n-1; i >= 0; i--) {
			if (temp[i] > max) {
				max = temp[i];
				count++;
			}//if
		} // for
		System.out.println(count);
	} // main
} // class