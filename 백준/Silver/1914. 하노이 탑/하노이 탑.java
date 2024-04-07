import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<int[]> list ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        list = new ArrayList<>();
        BigInteger count = new BigInteger("2");

        System.out.println(count.pow(n).subtract(new BigInteger("1")));

        if( n<=20 ){
            hanoi(n,1, 3, 2);
            for (int i = 0; i < list.size(); i++) {
                int [] step = list.get(i);
                System.out.println(step[0] + " " + step[1]);
            }
        }


    }
    private static void hanoi(int n, int from, int to, int via){
        if (n == 1){
            list.add(new int[]{from, to});
        }else{
            // 1. n-1개의 원판을 1 -> 2
            hanoi(n-1, from, via, to);
            list.add(new int[]{from, to});
            // 2. n-1 개의 원판을 2 -> 3
            hanoi(n-1, via, to, from);
        }
    } // hanoi
}