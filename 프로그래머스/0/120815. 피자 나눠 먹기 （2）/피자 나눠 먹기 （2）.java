class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1 ; i < 600 ; i++){
            if( (i * 6) % n == 0)
                return i;
        }
        return answer;
    }
}