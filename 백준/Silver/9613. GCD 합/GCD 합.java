import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		
		StringBuilder sb = new StringBuilder();
		
		String temp[];
		int [] arr;
		long sum;
		for (int i = 0; i < n; i++) {
			temp = br.readLine().split(" ");
			
			arr = new int [ Integer.parseInt(temp[0]) ];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt( temp[j+1] );
				
			} // for
			
			sum = 0;
			
			
			for (int j = 0; j < arr.length; j++) {
				for (int z = j+1; z < arr.length; z++) {
					sum += gcd(arr[j], arr[z]);
				}
			}
			
			sb.append(sum).append("\n");
			
		} // for
		
		System.out.println(sb.toString());
		
	} // main
	
	public static int gcd (int a, int b) {
		if(b == 0) return a;
		
		return gcd(b, a%b);
	}
}