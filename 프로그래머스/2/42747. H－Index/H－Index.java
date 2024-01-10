import java.util.*;
class Solution {
    public int solution(int[] citations) {
        
        Arrays.sort(citations);
        int max = citations[citations.length - 1 ];
        
        int count = 0;
        while(max > 0){
            count = 0;
            for(int i = 0 ; i < citations.length ; i ++ ){
                
                if( citations[i] > max ){
                    count ++;
                } // if
                
            } // for
            
            if(count >= max)
                return count;
            
            max--;
            
        } // while
        
        return 0;
        
        
    }
}