import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static char map[][];
	static boolean temp[][];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		
		map = new char[m][n];
		temp = new boolean [m][n];
		String line;
		for (int i = 0; i < map.length; i++) {
			line = br.readLine();
			for (int j = 0; j < map[0].length; j++) {
				map[i][j] = line.charAt(j);
				if(map[i][j] == 'W') {
					temp[i][j] = true;
				}else {
					temp[i][j] = false;
				}
			} // for
		} // for
		
		int x = m-7;
		int y = n-7;
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y ; j++) {
				count(i, j);
			} // for
			
		} // for
		
		Collections.sort(list);
		
		System.out.println(list.get(0));
		
	} // main
	
	public static void count(int x, int y) {
		
		boolean flag = false;
		flag = temp[x][y];
		int count = 0;
		
		for (int i = x; i < x + 8 ; i++) {
			for (int j = y; j < y+ 8 ; j++) {
				if(temp[i][j] != flag)
					count++;
				
				flag = !flag;
			}
			flag = !flag;
		}
		count = Math.min(count, 64-count);
		list.add(count);

	} //count
}