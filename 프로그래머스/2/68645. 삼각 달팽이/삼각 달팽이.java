import java.util.*;
class Solution {
    public ArrayList solution(int n) {
       
        ArrayList<Integer> list = new ArrayList<>();
        int arr[][] = new int[n][n];
        int x = -1, y = 0;
        int idx = 1;
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++ ){
                
                if(i % 3 == 0){
                    x++;
                }else if(i % 3 == 1){
                    y++;
                }else if( i % 3 == 2){
                    x--;
                    y--;
                }
                arr[x][y] = idx++;
            }
        }
        
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++ ){
                if(arr[i][j] > 0){
                    list.add(arr[i][j]);
                }
            }
        }
        
        return list;
    }
}