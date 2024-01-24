import java.util.*;
class Solution {
    
    boolean visited [] ;
    ArrayList<String> list ;
    
    public String[] solution(String[][] tickets) {
        
        visited = new boolean[tickets.length];
        list = new ArrayList<>();
        int cnt = 0;
        
        dfs("ICN", "ICN", tickets, cnt);
        
        Collections.sort(list);
        
        
        return list.get(0).split(" ");
    } // solution
    
    public void dfs(String start, String route, String [][] tickets, int cnt ){
        
        if(cnt == tickets.length){
            list.add(route);
            return;
        } // if
        
        for(int i = 0 ; i < tickets.length ; i++){
            if( start.equals(tickets[i][0]) && !visited[i]){
                visited[i] = true;
                dfs(tickets[i][1], route + " " + tickets[i][1], tickets, cnt+1);
                visited[i] = false;
            } // if
        } // dfs
            
        
        
    } // dfs
}