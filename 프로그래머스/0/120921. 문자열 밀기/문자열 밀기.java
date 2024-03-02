import java.util.*;

class Solution {
    public int solution(String A, String B) {
        
        int length = A.length();
        int cnt = 0;
        
        while (cnt < length){
            if(A.equals(B))
                return cnt;
            A = A.substring(length-1, length) + A.substring(0, length -1);
            cnt++;
        }
        
        return -1;
    }
}