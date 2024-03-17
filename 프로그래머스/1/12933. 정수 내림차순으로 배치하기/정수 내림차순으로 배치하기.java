import java.util.*;
class Solution {
    public long solution(long n) {
        String answer = "";
        
        String temp[] = String.valueOf(n).split("");
        Arrays.sort(temp, (o1,o2) -> Integer.parseInt(o2) - Integer.parseInt(o1) );
        
        for(String s : temp){
            answer += s;
        }
            
        return Long.valueOf(answer);
    }
}