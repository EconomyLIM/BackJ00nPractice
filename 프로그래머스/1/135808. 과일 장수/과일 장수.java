import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Integer [] temp = Arrays.stream(score).boxed().toArray(Integer[] :: new);
        
        Arrays.sort(temp, Collections.reverseOrder() );
        
        score = Arrays.stream(temp).mapToInt(i->i).toArray();
        int divide = score.length / m;
        int length = divide * m ;
        int count = 0;
        
        for(int i = 0 ; i < length ; i++ ){
            count ++;
            if(count == m ){
                
                answer += score[i] * m;
                count = 0;
            }
            
        }
        
        return answer;
    }
}