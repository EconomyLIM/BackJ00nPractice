import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Integer.parseInt(br.readLine());
		
		long scene[] = new long[3];
		
		scene[0] =  (n-2)*(n-2) + ( 4*(n-2)*(n-1) ) ; // 한면만 보이는 갯수
		scene[1] = ( 4*(n-2) ) + ( 4*(n-1) ); // 두면만 보이는 갯수  ( 4*(n-2) ) + ( 4*(n-2) );
		scene[2] = 4; // 세면만 보이는 갯수

		int arr[] = new int[6];
		long num = 0;
		long sum = 0;
		long min;
		String s[] = br.readLine().split(" ");
		for (int i = 0; i < 6; i++) {
			arr[i] = Integer.parseInt(s[i]);
		} // for
		
		
		if (n==1) {
			Arrays.sort(arr);
			min = arr[0];
			for (int i = 0; i < arr.length-1; i++) {
				sum += arr[i];
			} //for
		} else {
			min = arr[0];
			//한면만 보이는 총 합 
			for (int i = 0; i < arr.length; i++) {
				min = Math.min(min, arr[i]);
			} //for
			
			sum += min*scene[0]; //한면만 보이는 총 합 
			
			// 두면이 보이는 총합
			min = Long.MAX_VALUE;
			
			for (int i = 0; i < arr.length; i++) {
				
				for (int j = i+1; j < arr.length; j++) {
					
					if (i+j != 5) {
						min = Math.min(min, arr[i]+arr[j]);
					} //if
					
				} // for
			} // for
			
			sum+= min*scene[1]; // 두면이 보이는 총합
			
			for (int i = 0; i < 3; i++) {
				num += Math.min(arr[i], arr[5-i]);
			} // for
			
			sum+= num*scene[2];
			
			
		}// if else
		
		System.out.println(sum);
	} // main
} // class
