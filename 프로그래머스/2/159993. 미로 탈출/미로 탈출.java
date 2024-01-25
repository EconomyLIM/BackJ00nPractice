import java.util.*;

class Solution {
    static final int dx [] = {-1, 0, 1, 0};
    static final int dy [] = {0, 1, 0, -1};
    
    static int labberX, labberY;
    static int startX, startY;
    static int exitX, exitY;
    
    static int visited [][];
    static char [][] temp;
    
    public int solution(String[] maps) {
        int answer = -1;
        
        char [] spell; 
        temp = new char[maps.length][maps[0].length()]; 
        visited = new int[maps.length][maps[0].length()];
        boolean isLabberOn = false;
        
        for(int i = 0 ; i < maps.length ; i ++){
            spell = maps[i].toCharArray();
            
            for(int j = 0 ; j < spell.length ; j++){
                temp[i][j] = spell[j];
                
                if(spell[j] == 'S'){
                    startX = i;
                    startY = j;
                } else if(spell[j] == 'L'){
                    temp[i][j] = 'O';
                    labberX = i;
                    labberY = j;
                } else if(spell[j] == 'E'){
                    temp[i][j] = 'O';
                    exitX = i; 
                    exitY = j;
                } 
            }
            
        } // for
        
        int startLabber = bfs(startX, startY, labberX, labberY);
        int LabberExit;
        if( startLabber != -1){
            
            visited = new int[maps.length][maps[0].length()];
            System.out.println(startLabber);
            LabberExit = bfs(labberX, labberY, exitX, exitY);
            
            if(LabberExit != -1){
                answer = startLabber + LabberExit;
            }else{
                answer = -1;
            } // if else
        } // if

        return answer;
    } // solution
    
    public static int bfs(int startX, int startY, int stopXX, int stopYY){
        Queue<int []> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});

        while( !queue.isEmpty() ){
            int [] current = queue.poll();
            int cx = current[0];
            int cy = current[1];
            
            if(cx == stopXX && cy == stopYY){
                return visited[cx][cy];
            }
            
            for(int i = 0 ; i < 4 ; i++){
                int mx = cx + dx[i];
                int my = cy + dy[i];
                
                if(mx < 0 || mx > temp.length -1 || my < 0 || my > temp[0].length -1 )
                    continue;
                
                if(visited[mx][my] == 0 && temp[mx][my] != 'X'){
                    visited[mx][my] = visited [cx][cy] + 1;
                    queue.add(new int[] {mx, my});  
                } // if
                
            } // for
            
        } // while
        return -1;
    } // bfs
    
} // class