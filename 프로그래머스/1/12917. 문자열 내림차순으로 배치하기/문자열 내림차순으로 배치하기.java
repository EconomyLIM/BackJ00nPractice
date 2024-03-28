import java.util.*;

class Solution {
    public String solution(String s) {
        
        String temp[] = s.split("");
        Arrays.sort(temp, Collections.reverseOrder() );
        StringBuilder sb = new StringBuilder();
        
        for(String a : temp){
            sb.append(a);
        }
        
        
        return sb.toString();
    }
}