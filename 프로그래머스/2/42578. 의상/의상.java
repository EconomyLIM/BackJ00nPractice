import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        
        String key = "";
        String value = "";
        
        List<String> wordList = null;
        Map<String,  List<String> > map = new HashMap<>();
        
        for(int i = 0 ; i < clothes.length ; i++){
            
            key =  clothes[i][1];
            value = clothes[i][0];
            
            if(!map.containsKey(key)){
                wordList = new ArrayList<>();
                map.put(key, wordList);
            } //if
            
            wordList = map.get(key);
            wordList.add(value);
            
        } // for
        
        int valueListCount = 1; 
            
            
        for(Map.Entry< String, List<String> > entry : map.entrySet()){
                
                List<String> valueList = entry.getValue();
                valueListCount *= valueList.size()+ 1;

                
         } // for
        
        return valueListCount-1;
    }
}