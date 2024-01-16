import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        
        List<Integer> list = new ArrayList<>();  
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0 ; i < progresses.length ; i++ ){
            queue.offer( (int) Math.ceil( (100 - progresses[i]) / (double)speeds[i] ) );    
        } // for
        
        int cnt = 1;
        
        while( !queue.isEmpty() ){
            cnt = 1;
            int i = queue.poll();    
            while( !queue.isEmpty() && i >= queue.peek() ){
                cnt++;
                queue.remove();
            } // while
            
            list.add(cnt);
            
        } // while
        
        
        
        return list;
    }
}