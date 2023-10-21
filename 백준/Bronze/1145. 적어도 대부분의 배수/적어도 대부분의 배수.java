
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in));
		int temp[] = new int [5];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 5; i++) {
			temp[i] = Integer.parseInt(st.nextToken());
		}
		ArrayList<Integer> hs = new ArrayList<>();
		int index = 1;
		while (hs.size()<=3) {
		
			for (int i = 0; i < temp.length; i++) {
				if ( index % temp[i]  ==0) {
					hs.add(temp[i]);
					if (hs.size() >= 3) {
						System.out.println(index);
						return;
					}else {
						
					}
				}//if
			} //for
			hs.clear();
			index++;
		} // while
		
	} // main
} // class
