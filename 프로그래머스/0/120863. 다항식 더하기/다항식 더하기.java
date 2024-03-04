import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        
        String temp[] = polynomial.replace(" +", "").split(" ");
        
        int cnt = 0; 
        int number = 0;
        for(int i = 0 ; i < temp.length ; i++){
            System.out.println(temp[i]);
            
            if( temp[i].contains("x") ){
                if( temp[i].length() >= 2){
                    cnt += Integer.parseInt(temp[i].replace( "x","" ) );
                }else{
                    cnt++;
                }
                
            } else{
                number += Integer.parseInt(temp[i]);
            }
        }
        
        if(cnt > 0){
            if(cnt == 1){
                answer += "x";
            }else{
                answer += String.valueOf(cnt) + "x";    
            }
        }
        if(cnt > 0 && number > 0){
            answer += " + " + String.valueOf(number);
        }else if (number > 0){
            answer += String.valueOf(number);
        }
        
        
        return answer;
    }
}