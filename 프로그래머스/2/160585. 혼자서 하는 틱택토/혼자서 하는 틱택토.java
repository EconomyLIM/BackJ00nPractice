class Solution {
    private static char temp[][] = new char[3][3];
    
    public int solution(String[] board) {
        int answer = 1;
        int winO = 0;
        int winX = 0;
        
        for(int i = 0 ; i < board.length ; i++){
            String line = board[i];
            for(int j = 0 ; j < line.length() ; j++){
                
                if(line.charAt(j) == 'O') {
                    winO ++;
                    temp[i][j] = 'O';
                }else if(line.charAt(j) == 'X'){
                    winX ++;    
                    temp[i][j] = 'X';
                }else{
                    temp[i][j] = '.';
                }
            } // for
             
        } // for
        
        
        if(winX > winO || winO - winX > 1)
            return 0;
        
        boolean isWinO = isWin('O');
        boolean isWinX = isWin('X');
        
        if(isWinO && isWinX )
            return 0;
        if(isWinO && winO - winX != 1)
            return 0;
        if(isWinX && winO != winX)
            return 0;
        
        
        return 1;
    }
    public static boolean isWin(char c){
        
        // 가로 이겼는지 
        for(int i = 0 ; i < 3 ; i++){
            if(temp[i][0] == temp[i][1] && temp[i][1] == temp[i][2] && temp[i][2] == c){
                return true;
            }
        }
        // 세로 이겼는지
        for(int i = 0 ; i < 3 ; i++){
            if(temp[0][i] == temp[1][i] && temp[1][i] == temp[2][i] && temp[2][i] == c){
                return true;
            }
        }
        // 대각선 이겼는지
        if(temp[0][0] == temp[1][1] && temp[1][1] == temp[2][2] && temp[2][2] == c){
            return true;
        }else if(temp[0][2] == temp[1][1] && temp[1][1] == temp[2][0] && temp[2][0] == c)
            return true;
        
        return false;
    } // isWin
}