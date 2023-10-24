import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int count = 0, i =1;
		while (n>0) {
			if (n<i) {
				i=1;
			}//if
			n -=i;
			count++;
			i++;
			
		}//while
		System.out.println(count);
	} //main
} //class
