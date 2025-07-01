import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0 ; i < players.length ; i ++){
            map.put(players[i], i);
        }
        
        String prevCallingName = "";
        String callingName = "";
        int callingNameLevel = 0;
        
        for(int i = 0 ; i < callings.length ; i ++ ){
            callingNameLevel = map.get(callings[i]);
            prevCallingName = players[callingNameLevel-1];
            callingName = callings[i];
        
            players[callingNameLevel-1] = callingName;
            players[callingNameLevel] = prevCallingName;
            
            // 이전에 있던 사람 순위는 불린 사람의 순위대로
            map.put(prevCallingName, callingNameLevel);
            
            // 불린 사람의 이전 사람의 순위로 이동
            map.put(callings[i], callingNameLevel - 1);
        }

        return players;
    }
}