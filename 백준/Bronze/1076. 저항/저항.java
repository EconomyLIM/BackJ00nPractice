import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		String s[] = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = new String[3];
		for (int i = 0; i < 3; i++) {
			temp[i] = br.readLine();
		} //for
		
		int m= Integer.parseInt( Integer.toString( Arrays.asList(s).indexOf(temp[0])) + Integer.toString( Arrays.asList(s).indexOf(temp[1])) );
		long z = m * (long)(Math.pow(10, Arrays.asList(s).indexOf(temp[2])));
		
		System.out.println(z);
	} // main
}// class