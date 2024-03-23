class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        for(int i = 0 ; i < String.valueOf(x).length() ; i++){
            sum += String.valueOf(x).charAt(i) - '0';
        }
        
        if(x % sum == 0){
            return true;
        }else{
            return false;
        }
        
    }
}