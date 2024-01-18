import java.util.*;
class Solution {
    public List<Integer> solution(int[] prices) {
        
        List<Integer> temp = new ArrayList<Integer>();
        int count = 0;
        
        for(int i = 0 ; i < prices.length ; i++){
            count = 0;
            for(int j = i ; j < prices.length ; j++){
                count++;
                if(prices[i] > prices[j]){
                    break;
                }
            } // for
            temp.add(count-1);
        } // for
        
        return temp;
    }
}