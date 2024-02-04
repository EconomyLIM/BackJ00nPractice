class Solution {
    static int answer  = 0;
    public int solution(int[] numbers, int target) {
        
        dfs(numbers, 0, target, 0);
        
        return answer;
    } // solution
    
    public static void dfs(int numbers[], int depth, int target, int result){
        
        if(depth == numbers.length){
            if(result == target)
                answer++;
            
            return;
        } // if
        
        int plus = result + numbers[depth];
        int minus = result - numbers[depth];
        
        dfs(numbers, depth + 1, target, plus);
        dfs(numbers, depth + 1, target, minus);
        
    } // dfs
    
} // class