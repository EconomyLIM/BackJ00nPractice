import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int aCnt = Integer.parseInt(st.nextToken());
        int bCnt = Integer.parseInt(st.nextToken());

        Set<Integer> aSet = new HashSet<>();
        Set<Integer> bSet = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aCnt; i++) {
            aSet.add( Integer.parseInt(st.nextToken()) );
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < bCnt; i++) {
            bSet.add( Integer.parseInt(st.nextToken()) );
        } // for

        int cnt = 0;
        for (Integer num : aSet){
            if(!bSet.contains(num)){
                cnt++;
            }
        }

        for (Integer num : bSet){
            if(!aSet.contains(num)){
                cnt++;
            }
        }

        System.out.println(cnt);
        
    }
}