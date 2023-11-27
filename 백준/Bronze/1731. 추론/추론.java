import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int [] temp = new int [n];
		int s = 0;
		for (int i = 0; i < temp.length; i++) {
			
			temp[i] = Integer.parseInt(br.readLine());
		} // for
		
		if (temp[1] % temp[0] == 0) {
			s = temp[1] / temp[0];
			System.out.println( temp[temp.length -1 ] * s );
		}else{
			s = temp[1] - temp[0];
			System.out.println( temp[temp.length -1 ] + s );
		} // if else
		
	} // main
} //class