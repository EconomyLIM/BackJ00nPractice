import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n[] = br.readLine().split(" ");
		
		int tempA[] = new int [Integer.parseInt(n[0])];
		int tempB[] = new int [Integer.parseInt(n[1])];
		
		String A[] = br.readLine().split(" ");
		String B[] = br.readLine().split(" ");
		
		int sumA = 0, sumB = 0;
		for (int i = 0; i < tempA.length; i++) {
			tempA[i] = Integer.parseInt(A[i]);
			sumA += tempA[i];
		} // for
		for (int i = 0; i < B.length; i++) {
			tempB[i] = Integer.parseInt(B[i]);
			sumB += tempB[i];
		} //for
		
		System.out.println(sumA - sumB);
		
	} // main
} // class