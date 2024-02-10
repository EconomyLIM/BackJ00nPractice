import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Integer temp[] = new Integer[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			temp[i] = Integer.parseInt(st.nextToken());
		} // for
		
		Arrays.sort(temp);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		for (int j : temp) {
			sum += j;
			list.add(sum);
		}
		int allsum = 0;
		
		for (int z : list) {
			allsum += z;
		}
		System.out.println(allsum);
		
	} // main
}