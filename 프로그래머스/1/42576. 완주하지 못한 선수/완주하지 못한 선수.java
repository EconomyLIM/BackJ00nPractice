import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> participants = new HashMap<>();
        
        for(String member : participant){
            if(!participants.containsKey(member)){
                participants.put(member, 1);
            }else{
                participants.replace(member, participants.get(member)+1);
            } // if else
            
        } // for
        
        for(String member : completion){
                participants.replace(member, participants.get(member)-1);
                
            } // for
        
        for(String member : participant){
           if(participants.get(member) >= 1 ){
               answer = member;
               break;
           } //if
            
        } // for
        
        return answer;
    }
}