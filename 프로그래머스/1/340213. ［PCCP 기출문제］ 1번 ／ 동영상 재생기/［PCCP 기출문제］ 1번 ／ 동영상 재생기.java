class Solution {
    
    private static int getSeconds(String time){
        String [] minuteSecond = time.split(":");
        // if(minuteSecond.length < 2){
        //     throw new IllegalException("올바른 형식이 아닙니다.");
        // }
        
        int minute = Integer.parseInt(minuteSecond[0]);
        int second = Integer.parseInt(minuteSecond[1]);
        
        return minute * 60 + second;
    }
    
    private static String getMMSS(int seconds){
        int minute = seconds / 60;
        int second = seconds % 60;
        
        return String.format("%02d", minute) + ":" + String.format("%02d", second);
    }
    
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int videoTime = getSeconds(video_len);
        int startTime = getSeconds(pos);
        int openingStartTime = getSeconds(op_start);
        int openingEndTime = getSeconds(op_end);
        
        int currentTime = startTime;
        if(openingStartTime <= currentTime && currentTime <= openingEndTime){
                currentTime = openingEndTime;
            }
        
        for (String command : commands){
            if("next".equals(command)){
                currentTime = Math.min(currentTime + 10, videoTime);
            }else{
                currentTime = Math.max(0, currentTime - 10);
            }
            
            if(openingStartTime <= currentTime && currentTime <= openingEndTime){
                currentTime = openingEndTime;
            }
        } // for
        
        return getMMSS(currentTime);
    }
    
}