import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        
        int a, b;
        Queue <Integer> temp1 = new LinkedList<>();
        Queue <Integer> temp2 = new LinkedList<>();
        
        long sum1 = 0, sum2 = 0;
        for(int i = 0 ; i < queue1.length ; i++){
            a = queue1[i];
            b = queue2[i];
            
            sum1 += a;
            sum2 += b;
            
            temp1.offer(a);
            temp2.offer(b);
        }
        
       
        for(int i = 0 ; i < queue1.length * 4 ; i++){
            if(sum1 == sum2){
                return i; 
            }
            else if(sum1 < sum2){
                b = temp2.poll();
                sum2 -= b;
                temp1.offer(b);
                sum1 += b;
            }else{
                a = temp1.poll();
                sum1 -= a;
                temp2.offer(a);
                sum2 += a;
            }

        } // for

        return -1;
    }
}

/*
1 
2 
1 1
2 2
1 
10

17 3
*/