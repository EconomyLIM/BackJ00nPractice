import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int x = 0 , y = 0;
        
        for(int i = 0 ; i < sizes.length ; i++) {
            x = sizes[i][0];
            y = sizes[i][1];
            if(x < y){
                sizes[i][0] = y;
                sizes[i][1] = x;
            }
            
        } // for
        int tempX = 0, tempY = 0;
        for(int i = 0 ; i < sizes.length ; i++) {
            x = sizes[i][0];
            y = sizes[i][1];
            if(tempX < x){
                tempX = x;
            }
            if(tempY < y)
                tempY = y;
            
        } // for
        
        
        return tempX* tempY;
    }
}