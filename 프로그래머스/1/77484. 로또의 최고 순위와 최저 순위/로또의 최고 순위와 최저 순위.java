class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        int zeroCnt = 0;
        int correctCnt = 0;
        for(int i = 0 ; i < lottos.length ; i++){
            if(lottos[i] == 0){
                zeroCnt++;
                continue;
            } // if
            
            for(int j = 0 ; j < win_nums.length ; j++){
                if(lottos[i] == win_nums[j]){
                    correctCnt++;
                    break;
                }
            }
        } // for
        
        int max = 0, min = 0;
        max = correctCnt + zeroCnt;
        if(max >= 6)
            max = 6;
        else if(max == 0)
            max = 1;
        
        min = correctCnt;
        if(min ==0)
            min = 1;
        
        return new int[]{7-max, 7-min};
    }
}