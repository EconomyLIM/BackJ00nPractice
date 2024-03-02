import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int temp[] = dots[0];
        
        for(int i = 1 ; i < dots.length ; i++){
            
            int current[] = dots[i];
            
            int tempA[] = dots[ getIndex(i , 1) ];
            int tempB[] = dots[ getIndex(i , 2) ];
            
            double A = Math.abs( temp[1] - current[1] )/ (double) Math.abs(temp[0] - current[0]);
            double B = Math.abs( tempA[1] - tempB[1] )/ (double) Math.abs( tempA[0] - tempB[0]);
            
            System.out.printf("%d, %f = %f \n", i , A, B);
            
            if(A == B)
                answer = 1;
            
            
        }
        return answer;
    }
    
    public static int getIndex(int index, int num){
        
        if(index + num > 3){
            return (index + num) % 3;
        }
        
        return index + num;
    }
}
//      1증가  2증가
// 1 ->  2 3 
// 2 ->  3 1
// 3 ->  1 2