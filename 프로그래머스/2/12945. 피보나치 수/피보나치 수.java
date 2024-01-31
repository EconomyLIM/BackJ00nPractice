import java.util.*;

class Solution {
    public int solution(int n) {
        
        long temp[] = new long [n+1];
        temp[1] = 1;
        for(int i = 2 ; i < temp.length ; i++){
            temp[i] = (temp[i-2] + temp[i-1]) % 1234567;
        }
        int answer =(int) temp[n];

        return answer;
    }
    
    
}