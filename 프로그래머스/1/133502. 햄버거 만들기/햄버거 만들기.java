import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : ingredient){
            list.add(i);
            while(list.size() >= 4){
                int temp = list.size();
                
                if( !(list.get(temp-1) == 1 &&
                    list.get(temp-2) == 3 &&
                    list.get(temp-3) == 2 &&
                    list.get(temp-4) == 1)
                    )
                    break;
                    answer ++;
                    
                    for(int z = 0 ; z < 4 ; z++){
                        list.remove(list.size()-1);
                    }
                
            }
        } // for
        
        return answer;
    }
}