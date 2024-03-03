class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        String kString = String.valueOf(k);
        
        for(int z = i ; z <= j ; z++ ){
            String temp = String.valueOf(z);
            for(int a = 0 ; a < temp.length() ; a++){
                if( temp.charAt(a) - '0' == k)
                    answer++;
            }
        }
        
        return answer;
    }
}