import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static final int seconds[] = {300, 60, 10};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 3; i++) {
			int temp = T / seconds[i];
			sb.append(temp + " ");
			T = T % seconds[i];
		} // for

		if (T == 0) {
			System.out.println(sb.toString());
		} else {
			System.out.println("-1");
		}
		
	} // main
}