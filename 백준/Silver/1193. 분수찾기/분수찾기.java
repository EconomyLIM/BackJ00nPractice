
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int x=1, y=1, temp=1;
		boolean sw = false;
		for (int i = 1; i <= n; i++) {
			if (sw) {
				x--;
				y++;
				if (x==0) {
					x=1;
					y=temp;
					temp++;
					sw = false;
				}
			}else {
				x++;
				y--;
				if(y==0) {
					y=1;
					x=temp;
					temp++;
					sw = true;
				} //if	
			} //else
			
		} // for
		System.out.printf("%d/%d",x,y);
	} // main
} // class
