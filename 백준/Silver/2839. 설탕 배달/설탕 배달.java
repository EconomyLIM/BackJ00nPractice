import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	static final int sugars[] = {5, 3};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int j = 0; j < 2; j++) {
			if(n % sugars[j] == 0)
				list.add(n / sugars[j]);
		}
		
		int i = 1;
		while ( true ) {
			
			int temp = n;
			int fiveCnt = sugars[0]*i;
			if(temp < fiveCnt) break;
			
			temp = temp - fiveCnt;
			if (temp % sugars[1] == 0 ) {
				list.add( (temp / sugars[1]) + i);
			}
			i++;
		} // while
		
		Collections.sort(list);
		if(list.size() > 0) {
			System.out.println(list.get(0));
		}else {
			System.out.println("-1");
		}
		
	} // main
}