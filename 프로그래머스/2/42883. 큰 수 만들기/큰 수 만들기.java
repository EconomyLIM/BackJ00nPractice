import java.util.*;

class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        char temp [] = number.toCharArray();
        
        int index = 0;
        int max = 0;
        for(int i = 0 ; i < temp.length - k; i++){
            max = 0;
            for(int j = index ; j <= k+i ; j++){
                if(temp[j] - '0' > max){
                    max = temp[j] - '0';
                    index = j+1;
                }    
            } // for
            answer.append(max);
        } //fo

        return answer.toString();
    }
}