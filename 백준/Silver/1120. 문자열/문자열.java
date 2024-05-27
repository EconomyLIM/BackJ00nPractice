import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        int aLen = a.length();
        int bLen = b.length();

        int cnt = 50;
        for (int i = 0; i < bLen - aLen + 1; i++) {
            int temp = 0;
            for (int j = 0; j < aLen; j++) {
                if(a.charAt(j) != b.charAt(j+i)) temp++;
            }
            cnt = Math.min(temp, cnt);
        }

        System.out.println(cnt);

    } // main
}