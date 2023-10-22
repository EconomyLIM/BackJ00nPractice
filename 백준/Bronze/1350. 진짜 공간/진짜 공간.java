
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		int fileCnt = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int temp[] = new int[fileCnt];
		for (int i = 0; i < fileCnt; i++) {
			temp[i] = Integer.parseInt(st.nextToken());
		} // for
		
		int cluster = Integer.parseInt(br.readLine());
		int n = 0 ;
		long result = 0;
		long a = 0;
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == 0) {
				n = 0;
			} // if
			else if( (temp[i] >= cluster) && ( temp[i] % cluster ==0 ) ) {
				n = temp[i] /cluster;
			}else {
				n = temp[i] /cluster  + 1; 
			}
			result += n;
		} // for
		a = result*cluster;
		System.out.println(a);
	} // main
} // class
