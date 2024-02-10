import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<int []> list = new ArrayList<int[]>();
		int [] temp;
		while (true) {
			String[] line = br.readLine().split(" ");
			temp = new int[3];
			for (int i = 0; i < line.length; i++) {
				temp[i] = Integer.parseInt(line[i]);
			}
			list.add(temp);
			if (temp[0] == 0 && temp[1] == 0 && temp[2] ==0 ) {
				break;
			} //if
		} // while
		
		StringBuilder sb = new StringBuilder();
		int day;
		for (int i = 0; i < list.size() -1; i++) {
			temp = list.get(i);
			
			day = 0;
			day += temp[2] / temp[1] * temp[0] + (temp[2] % temp[1] > temp[0] ? temp[0] : temp[2] % temp[1] );
			
			sb.append("Case " + (i+1) + ": ").append(day).append("\n");

		}
		
		System.out.println(sb.toString());

	} // main
}