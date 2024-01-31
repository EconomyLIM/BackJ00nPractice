class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        
        int length = triangle.length;
        int temp [][] = new int [length][length];
        temp[0][0] = triangle[0][0];
             
        for(int i = 1 ; i < length ; i++){
            // 맨 왼쪽
            temp[i][0] = temp[i-1][0] + triangle[i][0];
            for(int j = 1 ; j < triangle[i].length ; j++){
                temp[i][j] = Math.max( temp[i-1][j-1], temp[i-1][j]) + triangle[i][j];
            }
        }
        
        for(int i = 0 ; i < length ; i++){
            answer = Math.max(answer, temp[length-1][i]);
        }
        
        return answer;
    }
}