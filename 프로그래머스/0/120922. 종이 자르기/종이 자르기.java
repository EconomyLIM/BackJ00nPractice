class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        
        int a = Math.max(M, N);
        int b = Math.min(M, N);
        
        int height = b - 1;
        int width = b * (a-1);
        
        answer = height + width;
        
        return answer;
    }
}