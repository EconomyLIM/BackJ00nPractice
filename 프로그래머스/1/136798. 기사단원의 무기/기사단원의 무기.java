class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        int count = 1;
        int test;
        for(int i = 1 ; i <= number ; i++){
            count = 1;
            test = i/2;
            for(int j = 1 ; j <= test ; j++){
                
                if( i % j == 0 ){
                    count ++;
                }
                
            } // for

            if(count > limit){
                
                    answer += power;
                    
                }else{
            answer += count;    
            }
            
        } // for
        return answer;
    }
}