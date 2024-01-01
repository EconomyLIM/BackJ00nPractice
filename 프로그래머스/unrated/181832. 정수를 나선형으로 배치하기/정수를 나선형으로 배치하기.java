class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int [n][n];
        
        for(int i = 0 ; i < n ; i ++) {
            for(int j = 0 ; j < n ; j ++){
                answer[i][j] = 0;
            } // for
        } // for
        
        int x = 0, y = -1;
        int direction = 1;
        int cnt = 1;
        while(n>0){
            
            for(int i = 0 ; i < n ; i ++){
                y += direction;
                answer[x][y] = cnt++;
            }
            n--;
            
            for(int i = 0 ; i < n ; i++){
                x += direction;
                answer[x][y] = cnt ++;
            }
            direction *= -1;
        } // while
        
        
        
        return answer;
    }
}