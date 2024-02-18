import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> wantList = new HashMap<>();
        
        for(int i = 0 ; i < want.length ; i++){
            wantList.put(want[i], number[i]);
        }
        
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0 ; i < discount.length - want.length ; i++){
            
            if( wantList.containsKey(discount[i]) ){
                map = new HashMap<>();
                int length;
                
                if( i + 10 > discount.length){
                    length = discount.length;
                }else{
                    length = i+10;
                }
                //System.out.println(i+": " +length);
                for(int j = i ; j < length ; j++){
                    map.put(discount[j], map.getOrDefault(discount[j], 0) + 1 );
                }
                
                if(wantList.equals(map)){
                    answer++;
                }
                
            } //if
        }
        
        
        return answer;
    }
}