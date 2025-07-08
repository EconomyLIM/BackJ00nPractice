import java.util.*;

class Solution {
    public List<Integer> solution(String s) {
        
        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        String[] stringArray = s.split("");
        
        for(int i = 0 ; i < stringArray.length ; i++){
            
            if(map.containsKey(stringArray[i])){
                int lastIndex = map.get(stringArray[i]);
                list.add(i - lastIndex);
                map.put(stringArray[i], i);
            }else{
                list.add(-1);
                map.put(stringArray[i], i);
            }
            
        }
        
        return list;
    }
}