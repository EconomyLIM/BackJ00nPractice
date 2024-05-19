import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
        static int cnt = 0, n , s;
    static int [] map;
    static boolean [] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        map= new int[n];
        visited = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            map[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0,0);

        if(s == 0) cnt--;
        System.out.println(cnt);

    }
    public static void dfs(int index, int sum){
        if(index == n){
            if(sum == s){
                cnt++;
            }
            return;
        }

        dfs(index+1 , sum+ map[index]);
        dfs(index+1, sum);
    }
}