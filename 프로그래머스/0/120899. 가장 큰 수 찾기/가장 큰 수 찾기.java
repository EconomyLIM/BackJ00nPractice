import java.util.*;
class Solution {
    public List<Integer> solution(int[] array) {
        
        List<Integer> list = new ArrayList<>();
        int max = 0;
        int temp = 0;
        for(int i = 0 ; i < array.length ; i++ ){
            if( max < array[i]){
                max = array[i];
                temp = i;
            }
        }
        list.add(max);
        list.add(temp);  
        return list;
    }
}