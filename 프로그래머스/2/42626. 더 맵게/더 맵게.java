import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {

        int temp = 0;
        PriorityQueue<Long> queue = new PriorityQueue<>();
        
        for(int i = 0 ; i < scoville.length; i ++){
            queue.offer(Long.valueOf(scoville[i]));
        } // for
        
        Long a, b, sum;
        while( queue.peek() < K ){
            
            if(queue.size() == 1)
                return -1;
            
            temp++;
            a = queue.poll();
            b = queue.poll();
            sum = a + b*2;
            queue.offer(sum);

        } // while

        return temp;
    }
}