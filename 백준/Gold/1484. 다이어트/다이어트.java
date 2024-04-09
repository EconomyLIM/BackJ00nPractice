import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int g = Integer.parseInt(br.readLine());

        long start = 1;
        long end = 2;

        boolean flag = false;
        while (end < 100000){
            long ps = start * start;
            long pe = end * end;
            if(pe - ps == g){
                System.out.println(end);
                flag = true;
            }

            if(pe - ps > g){
                start++;
            }else{
                end++;
            }

        } // while

        if (!flag){
            System.out.println(-1);
        }

    }
}