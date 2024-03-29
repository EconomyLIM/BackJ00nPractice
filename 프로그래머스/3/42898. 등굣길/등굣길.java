import java.util.*;

class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int mod = 1000000007;
        
        int map[][] = new int[n+1][m+1];
        // 
        int x, y;
        for(int i = 0 ; i < puddles.length ; i++){
            x = puddles[i][1];
            y = puddles[i][0];
            map[x][y] = -1;
        }
        
        map[1][1] = 1;
        for(int i = 1; i < n + 1 ; i++){
            for(int j = 1; j < m + 1 ; j++){
                if(map[i][j] == -1) continue;
                if(map[i-1][j] > 0 ) map[i][j] += map[i-1][j] % mod;
                if(map[i][j-1] > 0 ) map[i][j] += map[i][j-1] % mod;
            }
        }
        
        answer = map[n][m] % mod;
        
        
        return answer;
    }
}