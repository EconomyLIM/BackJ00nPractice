import java.util.*;

class Solution {
    
    static final int dx[] = {0,1,0,-1};
    static final int dy[] = {1,0,-1,0};
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        int n = maps.length, m = maps[0].length;
        
        int [][] visited = new int [n][m];
        
        bfs(maps, visited);
        
        answer = visited[n-1][m-1];
        
        return answer == 0 ? -1 : answer;
    } // solution
    
    public void bfs(int [][] maps, int [][] visited){
        visited[0][0] = 1;
        Queue<int []> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        
        while( !queue.isEmpty() ){
            int current[] = queue.poll();
            int cX = current[0];
            int cY = current[1];
            
            for(int i = 0 ; i < 4 ; i++){
                int mX = cX + dx[i];
                int mY = cY + dy[i];
                
                if(mX < 0 || mX > maps.length -1 || mY < 0 || mY > maps[0].length -1)
                    continue;
                
                if(visited[mX][mY] == 0 && maps[mX][mY] == 1){
                    visited[mX][mY] = visited[cX][cY] + 1;
                    queue.add(new int[] {mX,mY});
                } // if
                
            } // for
            
        } // while
        
        
    } // bfs
    
}