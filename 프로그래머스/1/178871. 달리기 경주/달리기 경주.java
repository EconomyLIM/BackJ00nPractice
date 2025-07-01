import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0 ; i < players.length ; i ++){
            map.put(players[i], i);
        }
        
        for(String name : callings){
            int rank = map.get(name);
            
            String temp = players[rank-1];
            players[rank] = temp;
            players[rank-1] = name;
            
            map.put(players[rank] , rank);
            map.put(players[rank-1], rank -1);
        }

        return players;
    }
}