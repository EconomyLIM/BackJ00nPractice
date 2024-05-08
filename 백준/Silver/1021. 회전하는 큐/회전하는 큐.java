import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static LinkedList<Integer> deque;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int [] temp = new int[M];
        for (int i = 0; i < M; i++) {
            temp[i] = Integer.parseInt(st.nextToken());
        } // for

        deque = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }

        int cnt = 0;

        for (int i = 0; i < temp.length ; i++) {
            if (check(temp[i])){
                while (temp[i] != deque.get(0)){
                    deque.addLast(deque.pollFirst());
                    cnt++;
                }
            }else{
                while (temp[i] != deque.get(0)){
                    deque.addFirst(deque.pollLast());
                    cnt++;
                }
            }

            deque.poll();
        }
        System.out.println(cnt);
    } // main
    public static boolean check(int a){
        for (int i = 0; i <= deque.size() / 2; i++) {
            if(a == deque.get(i))
                return true;
        }
        return false;
    }
}