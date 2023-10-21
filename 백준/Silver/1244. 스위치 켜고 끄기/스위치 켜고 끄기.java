
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int switchCnt = Integer.parseInt(br.readLine()); // 스위치 수 입력받기 
		
		int s[] = new int [switchCnt];  
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < switchCnt; i++) {
			s[i] = Integer.parseInt(st.nextToken());
		} // 스위치 on/off 입력
		
		boolean sw[] = new boolean[switchCnt];
		for (int i = 0; i < switchCnt; i++) {
			if(s[i]== 0) {
				sw[i] = false;
			}else if (s[i]==1) {
				sw[i] = true;
			}
		} // 스위치 1,0 을 boolean 형으로 변환
		
		int count = Integer.parseInt(br.readLine()); // 학생수 입력

		for (int i = 0; i < count; i++) {
			st = new StringTokenizer(br.readLine());

			int gender = Integer.parseInt(st.nextToken());
			int number = Integer.parseInt(st.nextToken());

			if (gender == 1) { // 학생이 1 (남자일때)
				for (int j = 0; j < sw.length; j++) {
					if ((j+1) % number == 0) {
						sw[j] = !sw[j];
					} //if
				} // for

			} // if

			if (gender == 2) { // 학생이 2(여자일때)
				sw[number -1] = !sw[number-1];
				for (int j = 0; j < sw.length/ 2; j++) {
					int k = number -1 -j;
					int z = number -1 +j;
					if(k <0 || z >= sw.length) {
						break;
						}
					if(sw[k] == sw[z]) {
						sw[k] = !sw[k];
						sw[z] = !sw[z];
					} else {
						break;
					}
				} // for
			} //if
		}//for

		for (int i = 0; i < sw.length; i++) {
			System.out.printf("%d ",sw[i]? 1:0);
			if ((i+1) % 20 ==0) {
				System.out.println();
			} //if
		} //for
	} //class
} //main
