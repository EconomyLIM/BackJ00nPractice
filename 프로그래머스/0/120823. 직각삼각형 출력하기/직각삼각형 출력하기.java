import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for(int j = 1 ; j <= n ; j++){
            for(int i = 0 ; i < j ; i++){
            sb.append("*");
            }
            sb.append("\n");
        }
        

        System.out.println(sb.toString());
    }
}