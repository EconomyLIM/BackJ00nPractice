import java.util.*;

class Solution {
    static final int dx[] = {-1, 0, 1, 0};
    static final int dy[] = {0, 1, 0, -1};
    
    static ArrayList<Integer> list = new ArrayList<>();
    static char [][] temp ;
    static boolean visited[][];
    
    public List<Integer> solution(String[] maps) {
        int[] answer = {};
        
        visited = new boolean[maps.length][maps[0].length()];
        temp = new char[maps.length][maps[0].length()];
        
        String line;
        for(int i = 0 ; i < maps.length ; i++){
            line = maps[i];
            for(int j = 0 ; j < line.length() ; j++){
                temp[i][j] = line.charAt(j);
            } // for
        }
        
        for(int i = 0 ; i < maps.length ; i++){
            line = maps[i];
            for(int j = 0 ; j < line.length() ; j++){
                if(!visited[i][j] && line.charAt(j) !='X'){
                    System.out.println(i + " : " + j);
                    bfs(i, j);
                } // if
            } // for
        }
        
        if(list.size() == 0 )
            list.add(-1);
        Collections.sort(list);
        
        return list;
    } // 
    
    public static void bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        int sum = 0;
        
        while( !queue.isEmpty() ){
            int current[] = queue.poll();
            int cx = current[0];
            int cy = current[1];
            
            sum += temp[cx][cy] - '0';
            
            for(int i = 0 ; i < 4 ; i++){
                int mx = cx + dx[i];
                int my = cy + dy[i];
                
                if(mx < 0 || mx >= temp.length || my < 0 || my >= temp[0].length)
                    continue;
                
                if(!visited[mx][my] && temp[mx][my] != 'X'){
                    queue.add(new int []{mx, my});
                    visited[mx][my] = true;
                }
                
            } // for
            
        } // while
        list.add(sum);
    } // bfs
}