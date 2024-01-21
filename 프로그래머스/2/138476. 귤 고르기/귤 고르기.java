import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        int count ;
        for(int i : tangerine){
            
            if( !map.containsKey(i)){
                map.put(i,1);
            }else{
                count = map.get(i);
                map.put(i, count+1);
            } // if else
            
        } // for
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
         for(Map.Entry<Integer, Integer> entry : map.entrySet() ){
             System.out.println(entry.getValue());
             queue.offer( entry.getValue() );
             
         }
        int temp = 0;
        while(!queue.isEmpty()){
            
            answer++;
            temp += queue.poll();
            if(temp >= k)
                break;
            
        }
        
        
        return answer;
    }
}