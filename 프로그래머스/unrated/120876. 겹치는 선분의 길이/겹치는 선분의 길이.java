class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int temp [] = new int [201];
        int a = 0, b= 0;
        for(int i = 0 ; i < lines.length ; i++){
            
            a = lines[i][0] + 100;
            b = lines[i][1] + 100;
            
            for(int j = a; j<b ; j++){
                temp[j] ++;
            }
            
        } // for
        
        for(int i = 0; i < temp.length ; i++){
            if(temp[i] > 1) {answer++;}
        } //for
        
        
        return answer;
    }
}