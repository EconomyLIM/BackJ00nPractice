import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        //init
        Queue<Pair> queue = new LinkedList<>();
        Pair pair;
        int value; 
        boolean isLocation;
        for(int i = 0 ; i < priorities.length ; i++){
            value = priorities[i];
            isLocation = false;
            
            if(location == i)
                isLocation = true;
            
            pair = new Pair(value, isLocation);
            queue.offer(pair);
            
        } // for
        
        // search
        int max = 0;
        
        while( !queue.isEmpty() ){
            answer++;
            max = 0;
            for(Pair maxpair : queue){
                max = Math.max(maxpair.value, max);
            } // for
            
            while(true){
                Pair pairs = queue.poll();
                
                if(pairs.value == max && pairs.isLocation == true){
                    return answer;
                }else if(pairs.value != max){
                    queue.offer(pairs);
                }else if(pairs.value == max){
                    break;
                }
            }
  
        } // while
        
        return answer;
    } // solution
    
    private static class Pair{
        int value;
        boolean isLocation;
        
        public Pair(int value, boolean isLocation){
            this.value = value;
            this.isLocation = isLocation;
        } 
    } // Pair
    
} // class
