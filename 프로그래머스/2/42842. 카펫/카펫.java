class Solution {
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow, x= 0 , y= 0;
        
        for(int i = 1 ; i < sum / 2 ; i ++ ){
            if(sum % i == 0 ){
                x = i;
                y = sum / i;
                    if((x-1)*2 + (y-1)*2 == brown)
                        break;
            } // if
        }
        
        return new int[]{y,x};
    }
}