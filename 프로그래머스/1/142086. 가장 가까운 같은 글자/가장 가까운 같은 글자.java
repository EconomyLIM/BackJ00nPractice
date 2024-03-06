class Solution {
    public int[] solution(String s) {
        int[] answer = new int [s.length()];
        
        for(int i = 0 ; i < s.length() ; i++){
            char temp = s.charAt(i);
            boolean flag = false;
            for(int j = 0 ; j < i ; j++){
                if(s.charAt(j) == temp){
                    answer[i] = i - j;
                    flag = true;
                }
            }
            
            if(!flag){
                answer[i] = -1;
            }
            
        }
        
        return answer;
    }
}