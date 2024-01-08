import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
        
        int[] temp = null;
        int start = 0;
        int end = 0;
        int length = 0;
        
        for(int i = 0; i < commands.length ; i++){ 
            start = commands[i][0]-1;
            end = commands[i][1];
            length = end - start+1;
            
            
            temp = new int[length];
            temp = Arrays.copyOfRange(array, start, end);        
           
             Arrays.sort(temp);
            
            answer[i] = temp[commands[i][2]-1];
            
        } // for
        
        
        return answer;
    }
}