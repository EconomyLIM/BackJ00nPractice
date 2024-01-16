class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        char [] temp = s.toCharArray();
        int i = 0;
        int sum = 0;
        
        for(char word : temp){
            i = word == '(' ? 1 : -1;
            
            sum += i;
            
            if(sum < 0) 
                return false;
            
        } // for
        
        return sum == 0 ? true : false;
    }
}