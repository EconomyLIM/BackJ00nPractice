import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        HashMap<String, Integer> map = new HashMap<>();
          
        for(int i = 0 ; i < players.length ; i++){
            map.put(players[i], i);
            
        } // for
        
        int ranking;
        String frontPlayer;
        
         for(String s : callings){
             ranking = map.get(s); // 이름 불린 사람의 순위를 갖고온다.
             frontPlayer = players[ranking-1]; // 찾은 사람의 바로 앞사람 이름을 갖고온다
             map.replace(s, ranking-1); // 이름 불린 사람의 순위를 1 감소 시킨다.
             map.replace(frontPlayer, ranking); // 바로 앞사람의 순위를 1 증가시킨다(찾은 순위로 바꾼다).
             
             players[ranking-1] = s; // 앞사람의 이름을 바꾼다
             players[ranking] = frontPlayer; // 찾은 사람의 이름을 바꾼다
             
         }

        return players;
    }
}