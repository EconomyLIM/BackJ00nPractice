import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int R1 = Integer.parseInt(st.nextToken());
        int C1 = Integer.parseInt(st.nextToken());
        int R2 = Integer.parseInt(st.nextToken());
        int C2 = Integer.parseInt(st.nextToken());

        int rows = R2 - R1 + 1;
        int cols = C2 - C1 + 1;
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < rows; i++) {
            int r = R1 + i;
            for (int j = 0; j < cols; j++) {
                int c = C1 + j;
                output.append(getCharAt(N, r, c));
            }
            output.append('\n');
        }
        System.out.print(output);
    }

    private static char getCharAt(int N, int r, int c) {
        int dia = 2 * N - 1;
        int x = r % dia;
        int y = c % dia;
        int dist = Math.abs(N - 1 - x) + Math.abs(N - 1 - y);
        return dist < N ? (char) ('a' + (dist % 26)) : '.';
    }
}

