class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        int xLength = park[0].length();
        int yLength = park.length;
        String [][] map = new String[yLength][xLength];
        
        int startX = 0, startY = 0;
        
        for(int i = 0 ; i < yLength ; i++){
            String[] temp = park[i].split("");
            for(int j = 0 ; j < xLength ; j++){
                map[i][j] = temp[j];
                
                if("S".equals(temp[j])){
                    startX = j;
                    startY = i;
                }
            } // for
        } // for
    
        int cx = startX;
        int cy = startY;
        
        for (String route: routes){
            String[] temp = route.split(" ");
            String direction = temp[0];
            int move = Integer.parseInt(temp[1]);
            
            int dx = 0;
            int dy = 0;
            
            //N이면 Y축 -1, S면 Y축 +1, E면 X축 +1, W == X축 -1
            if("N".equals(direction)) {dy = dy - 1;}
            if("S".equals(direction)) {dy = dy + 1;}
            if("E".equals(direction)) {dx = dx + 1;}
            if("W".equals(direction)) {dx = dx - 1;}
            
            boolean isGoing = true;
            
            for(int i = 1 ; i <= move ; i++){
                int mx = cx + dx * i;
                int my = cy + dy * i;
                
                // 공원 밖으로 넘는지 확인
                if(mx < 0 || mx >= xLength || my < 0 || my >= yLength){
                    isGoing = false;
                    break;
                }
                // 장애물이 있는지 확인
                if("X".equals(map[my][mx])){
                    isGoing = false;
                    break;
                }
            } // for
            
            // 통과했으면 move만큼 이동
            if(isGoing){
                cx = cx + dx * move;
                cy = cy + dy * move;
            }
            
        } // for
        return new int[]{cy, cx};
    }
}