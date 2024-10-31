import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int n;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int[][] arr;
        for (int i = 0; i < T; i++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[2][n + 1];

            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[0][j] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[1][j] = Integer.parseInt(st.nextToken());
            }

            // 이전 값을 저장할 변수 (두 단계만 저장하여 메모리 최적화)
            int prev0 = arr[0][1];
            int prev1 = arr[1][1];
            int prevPrev0 = 0, prevPrev1 = 0;
            int curr0, curr1;

            for (int j = 2; j <= n; j++) {
                curr0 = Math.max(prev1, prevPrev1) + arr[0][j];
                curr1 = Math.max(prev0, prevPrev0) + arr[1][j];

                prevPrev0 = prev0;
                prevPrev1 = prev1;
                prev0 = curr0;
                prev1 = curr1;
            }

            sb.append(Math.max(prev0, prev1)).append("\n");
        }

        System.out.println(sb.toString());
    }
}
