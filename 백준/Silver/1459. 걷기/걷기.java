import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        long w = Long.parseLong(st.nextToken());
        long s = Long.parseLong(st.nextToken());

        long oneLone = (x+y) * w;
        long zigZag;
        if((x+y) % 2 == 0){
            zigZag = (Math.max(x,y)) * s;
        }else {
            zigZag = (Math.max(x,y)-1) * s + w;
        }
        long zigOne = (Math.min(x,y) * s) + (Math.abs(x-y) * w);

        System.out.println(Math.min(oneLone, Math.min(zigZag, zigOne)));

    }
}
