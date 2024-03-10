import java.util.*;
class Solution {
    static final int dx [] = {-1,0, 1, 0 , -1, -1 , 1, 1};
    static final int dy [] = {0,1, 0, -1 , 1, -1, 1, -1};
    static boolean visited [][];
    
    public int solution(int[][] board) {
        int answer = 0;
        visited = new boolean [board.length][ board[0].length ];
        
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if( board[i][j] == 1){
                    bfs(i, j);
                }
            }
        }
        
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if( !visited[i][j]){
                    answer++;
                }
            }
        }
        
        return answer;
    } 
    
    public static void bfs(int x, int y){
        Queue<int []> queue = new LinkedList<>();
        queue.add(new int[] {x, y});
        visited[x][y] = true;
        
        while( !queue.isEmpty() ){
            int current[] = queue.poll();
            int cx = current[0];
            int cy = current[1];
            
            for(int i = 0 ; i < dx.length ; i++){
                int mx = cx + dx[i];
                int my = cy + dy[i];
                
                if(mx < 0 || mx >= visited.length || my < 0 || my >=visited[0].length){
                    continue;
                }
            
                visited[mx][my] = true;
                
            } // for
            
        }
        
        
    } // bfs
}