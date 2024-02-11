import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int temp[][] = new int[n][2];
		StringTokenizer st;
		for (int i = 0; i < temp.length; i++) {
			st = new StringTokenizer(br.readLine());
			temp[i][0] = Integer.parseInt(st.nextToken());
			temp[i][1] = Integer.parseInt(st.nextToken());
		} // for
		
		Arrays.sort(temp, (o1, o2) -> o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1]);
		// Arrays.sort(temp, (o1, o2) -> o1[1] - o2[1]);
		int end = 0;
		int cnt = 0;
		for (int i = 0; i < temp.length; i++) {
			
			if(end <= temp[i][0]) {
				end = temp[i][1];
				cnt++;
			}
			
		} // for
		System.out.println(cnt);
		
	} // main
}