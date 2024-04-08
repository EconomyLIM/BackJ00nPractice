import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int [][] map;
    static boolean [][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        map = new int[m][n];
        visited = new boolean[m][n];

        boolean flag = true;
        int count = 1;

        int minRow = 0;
        int minCol = 0;
        int maxRow = m-1;
        int maxCol = n-1;

        int x = 0, y = 0;
        while (count <= m * n) {
            for (int i = minCol; i <= maxCol; i++) {
                map[minRow][i] = count++;
                if(count == m * n + 1){
                 x = minRow;
                 y = i;
                }
            }
            for (int i = minRow + 1; i <= maxRow ; i++) {
                map[i][maxCol] = count++;
                if(count == m * n + 1){
                    x = i;
                    y = maxCol;
                }
            }
            for (int i = maxCol-1; i >= minCol ; i--) {
                map[maxRow][i] = count++;
                if(count == m * n + 1){
                    x = maxRow;
                    y = i;
                }
            }
            for (int i = maxRow -1; i > minRow ; i--) {
                map[i][minCol] = count++;
                if(count == m * n + 1){
                    x = i;
                    y = minCol;
                }
            }

            minCol++;
            minRow++;
            maxCol--;
            maxRow--;

        } // while
        
        System.out.printf("%d %d", y, x);
        
    } // main
}