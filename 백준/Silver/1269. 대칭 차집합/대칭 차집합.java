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

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()){
            a.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()){
            b.add(Integer.parseInt(st.nextToken()));
        }
        
        int allCnt = 0;

        for(int num : a){
            if(!b.contains(num)){
               allCnt++;
            }
        }

        for(int num : b){
            if(!a.contains(num)){
                allCnt++;
            }
        }

        System.out.println(allCnt);

    }
}