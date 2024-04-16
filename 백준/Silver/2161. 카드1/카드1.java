import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1 ; i <= n ; i++) {
            queue.add(i);
        }
        StringBuilder sb = new StringBuilder();

        boolean flag = true;
        int temp = 0;
        while ( !queue.isEmpty() ){
            temp = queue.poll();
            if (flag){
                sb.append(temp).append(" ");
                flag = false;
            }else{
                queue.add(temp);
                flag = true;
            } //if
        } // while

        System.out.println(sb.toString());
    }
}
