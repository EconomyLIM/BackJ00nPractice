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

        int [][] map = new int[n][m];
        String temp[];
        for (int i = 0; i < map.length; i++) {
            temp = br.readLine().split(" ");
            for (int j = 0; j < temp.length ; j++) {
                map[i][j] = Integer.parseInt(temp[j]);
            }
        } // for

        int k = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int sum;
        for (int i = 0; i < k; i++) {
            sum = 0;

            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) -1;
            int b = Integer.parseInt(st.nextToken()) -1;
            int x = Integer.parseInt(st.nextToken()) -1;
            int y = Integer.parseInt(st.nextToken()) -1;

            for (int j = a; j <= x; j++) {
                for (int l = b; l <= y; l++) {
                    sum += map[j][l];
                }
            }

            if (i != k-1){
                sb.append(sum).append("\n");
            }else{
                sb.append(sum);
            }

        } // for

        System.out.println(sb.toString() );
    }
}