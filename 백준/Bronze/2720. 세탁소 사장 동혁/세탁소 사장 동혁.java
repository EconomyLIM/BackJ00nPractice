import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static final int reverse[] = {25, 10, 5, 1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		
		int temp[] = new int[K];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = Integer.parseInt(br.readLine());
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < temp.length; i++) {
			
				for (int j = 0; j < 4; j++) {
					int cnt = temp[i] / reverse[j];
					sb.append(cnt +" ");
					temp[i] = temp[i] % reverse[j];
					
				} // for
		sb.append("\n");
		} //for
		System.out.println(sb.toString());
	}
}