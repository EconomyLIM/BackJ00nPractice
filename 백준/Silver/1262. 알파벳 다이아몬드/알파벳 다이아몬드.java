import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r1 = Integer.parseInt(st.nextToken());
        int c1 = Integer.parseInt(st.nextToken());
        int r2 = Integer.parseInt(st.nextToken());
        int c2 = Integer.parseInt(st.nextToken());
        
        int dia = n * 2 - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0, s = r1; i < r2 - r1 + 1; i++, s++) {
            for (int j = 0, t = c1; j < c2 - c1 + 1; j++, t++) {
                int x = s % dia;
                int y = t % dia;
                int dis = Math.abs(n - 1 - x) + Math.abs(n - 1 - y);
                if(dis > n -1){
                    sb.append(".");
                }else{
                    sb.append((char)('a' + (dis % 26)));
                }
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}