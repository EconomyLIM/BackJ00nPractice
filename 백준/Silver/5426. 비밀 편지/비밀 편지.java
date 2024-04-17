import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String temp[];
        String letter[][];

        for (int i = 0; i < n; i++) {
            temp = br.readLine().split("");
            int a = (int) Math.sqrt(temp.length);
            letter = new String[a][a];

            int cnt = 0;
            for (int j = 0; j < letter.length; j++) {
                for (int k = 0; k < letter.length; k++) {
                    letter[j][k] = temp[cnt++];

                }
            }

            for (int j = letter.length -1; j >= 0 ; j--) {
                for (int k = 0; k < letter.length ; k++) {
                    sb.append(letter[k][j]);
                }
            }

            sb.append("\n");
        }

        System.out.println(sb.substring(0, sb.length()-1).toString());
    }
}
