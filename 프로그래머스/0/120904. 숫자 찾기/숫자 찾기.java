class Solution {
    public int solution(int num, int k) {
        
        String temp = String.valueOf(num);
        for(int i = 0 ;i < temp.length() ; i++){
            if( temp.charAt(i) - '0' == k){
                return i+1;
            } 
        }
        return -1;
    }
}