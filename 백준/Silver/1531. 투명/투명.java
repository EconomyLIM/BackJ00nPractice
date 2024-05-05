import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int [][] map = new int[100][100];
        int x1, y1, x2, y2;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            x1 = Integer.parseInt(st.nextToken())-1;
            y1 = Integer.parseInt(st.nextToken())-1;
            x2 = Integer.parseInt(st.nextToken())-1;
            y2 = Integer.parseInt(st.nextToken())-1;

            for (int j = x1; j <= x2; j++) {
                for (int k = y1; k <= y2 ; k++) {
                    map[j][k]++;
                }
            }

        }

        int cnt = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if(map[i][j] > m){
                    cnt++;
                }

            }
        }

        System.out.println(cnt);

    }
}