class Solution {
    public int[][] solution(int[][] arr) {
        
        int a = arr.length;
        int b = arr[0].length;
        
        int length = Math.max(a,b);
        
        int[][] answer = new int [length][length];
        
        for(int i = 0 ; i < arr.length ; i ++){
            
            for(int j = 0; j < arr[0].length ; j ++){
                
                answer[i][j] = arr[i][j];
                
            } // for
            
        }// for
        
        return answer;
    }
}