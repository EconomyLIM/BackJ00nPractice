import java.util.*;

class Solution {
    public List<Integer> solution(String[] name, int[] yearning, String[][] photo) {

        List<Integer> list = new ArrayList<>();
        int score;
        
        for(String [] photoList : photo){
            score = 0;
            for(String photos : photoList){
                
                for(int i = 0 ; i < name.length ; i++){
                    if(photos.equals(name[i]))
                        score += yearning[i];
                }
                
            } // for
            list.add(score);
        } // for
        
        return list;
    }
}