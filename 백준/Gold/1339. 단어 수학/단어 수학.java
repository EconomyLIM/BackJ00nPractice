import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int alpha[] = new int [26];
		String [] temp = new String[n];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = br.readLine();
		} //for
		
		for (int i = 0; i < temp.length; i++) {
			int max = (int) Math.pow(10, temp[i].length()-1);
			for (int j = 0; j < temp[i].length(); j++) {
				alpha[(int) temp[i].charAt(j)-65] += max;
				max /= 10;
			} //for
		} //for
		Arrays.sort(alpha);
		int index = 9;
		int sum = 0;
		for (int i = alpha.length-1 ; i > 0; i--) {
			if (alpha[i] == 0) {
				break;
			} // if
			sum+= alpha[i]*index;
			index--;
		}// for
		System.out.println(sum);
		
	} // main
} // class