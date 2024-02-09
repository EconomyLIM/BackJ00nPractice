import java.util.*;

class Solution {
    
    static final int dx[] = {-1, 0, 1, 0};
    static final int dy[] = {0, 1, 0, -1};
    static boolean visited[][];
    static ArrayList<Integer> list = new ArrayList<>();
    static HashMap<Integer, Integer> hashmap = new HashMap<>();
    
    public int solution(int[][] land) {
        
        // init
        int n = land.length;
        int m = land[0].length;
   
        int temp = 0;
        visited = new boolean [n][m];
        for(int i = 0 ; i < n ; i ++ ){
            for(int j = 0 ; j < m ; j++){
                if(!visited[i][j] && land[i][j] == 1) {
                   bfs(land, i, j);
                } // if
            } // for
        } // for
        
        int answer = 0;
        for(int i : hashmap.values() ){
           if(answer < i)
               answer = i;
        }
        
        return answer;
    }
    
    public static void bfs(int [][] map, int x, int y){
        Queue<int []> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        int sum = 0 ;
        HashSet<Integer> set = new HashSet<>();
        while( !queue.isEmpty() ){
            int current[] = queue.poll();
            int cx = current[0];
            int cy = current[1];
            sum = sum + 1;
            set.add(cy);
            
            for(int i = 0 ; i < 4 ; i++){
                int mx = cx + dx[i];
                int my = cy + dy[i];
                
                if(mx < 0 || mx >= map.length || my < 0 || my >= map[0].length){
                    continue;
                }
                
                if(map[mx][my] == 1 && !visited[mx][my]){
                    visited[mx][my] = true;
                    queue.add(new int[]{mx, my});
                } // if
                
            } //for
        } // while
        for(int i : set){
            hashmap.put(i, hashmap.getOrDefault(i,0) + sum);
        }

    } // bfs
 
}