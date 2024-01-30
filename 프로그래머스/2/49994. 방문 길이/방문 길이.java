import java.util.*;
class Solution {
    public int solution(String dirs) {
        int answer = 0;
        
        char c [] = dirs.toCharArray();
        HashSet<String> set = new HashSet<>();
        int x = 0, y = 0;
        String currentLine;
        for(int i = 0 ; i < c.length ; i++){
            currentLine = x + "" + y;
            if(c[i] == 'U'){
                if(y+1 > 5)
                    continue;
                ++y;
                set.add(currentLine+x+""+ y+""+x+""+y+currentLine);
                System.out.println(currentLine+x+""+ y+""+x+""+y+currentLine);
            }
            else if(c[i] == 'D'){
                if(y-1 < -5)
                    continue;
                --y;
                set.add(x+""+y+currentLine+currentLine+x+""+y);
                System.out.println(x+""+y+currentLine+currentLine+x+""+y);
            }
            else if(c[i] == 'R'){
                if(x+1 > 5)
                    continue;
                ++x;
                set.add(currentLine+x+""+ y+""+x+""+y+currentLine);
            }
            else if(c[i] == 'L'){
                if(x-1 < -5)
                    continue;
                --x;
                set.add(x+""+y+currentLine+currentLine+x+""+y);
            }
            
            
        } // for
        
        
        return set.size();
    }
}