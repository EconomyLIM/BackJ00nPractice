import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException, NumberFormatException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < m ; i++){
            sb.append( "*".repeat(n)).append("\n");
        }

        System.out.println(sb.toString());
    }
}