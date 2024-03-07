import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        HashSet<String> set = new HashSet<>();
        
        for(int i = 0 ; i < my_string.length() ; i++){
            
            if(!set.contains( String.valueOf(my_string.charAt(i)) )){
                set.add( String.valueOf(my_string.charAt(i)) );
                answer += String.valueOf(my_string.charAt(i));
            }
            
        }
        return answer;
    }
}