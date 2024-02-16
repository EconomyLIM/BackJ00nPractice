import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 
		int m = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> list = new ArrayList<>();
		int a[] = new int [n];
		int b[] = new int [m];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < a.length; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < b.length; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		for (int i : list) {
			sb.append(i).append(' ');
		}
		
		System.out.println(sb.toString());
	}
}
