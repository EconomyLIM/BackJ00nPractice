import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();

        int aCnt = 0;
        for (int i = 0; i < temp.length(); i++) {

            if(temp.charAt(i) == 'a') aCnt++;

        } // for

        int min = Integer.MAX_VALUE;
        int bCnt;
        for (int i = 0; i < temp.length(); i++) {
            bCnt = 0;
            for (int j = i; j < i + aCnt; j++) {
                if(temp.charAt(j % temp.length() ) == 'b'){
                    bCnt++;
                }
            }
            min = Math.min(min, bCnt);
        }

        System.out.println(min);
    }
}