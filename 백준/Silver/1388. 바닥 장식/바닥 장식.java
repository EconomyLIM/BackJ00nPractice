import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer nm = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(nm.nextToken());
        int m = Integer.parseInt(nm.nextToken());
		char s[][] = new char[n][m];
		int index = 0;
		for (int i = 0; i < s.length; i++) {
			//			String temp = br.readLine();
			String temp = br.readLine();
			for (int j = 0; j < s[0].length; j++) {
				s[i][j] = temp.charAt(j); 

			} //for
		} //for
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(i != 0 && s[i][j] == '|' && s[i - 1][j] == '|') {    // |가 위아래로 이어져 있으면 한개로 계산하므로 총 개수를 더해주지 않는다.
                    continue;
                }else if(j != 0 && s[i][j] == '-' &&s[i][j - 1] == '-') {    // -가 좌우로 이어져 있으면 한개로 계산하므로 총 개수를 더해주지 않는다.
                    continue;
                }
				index++;
			} //for
		} //for
		System.out.println(index);
	} // main
}//class