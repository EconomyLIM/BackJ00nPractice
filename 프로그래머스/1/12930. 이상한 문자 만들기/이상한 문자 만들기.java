class Solution {
    public String solution(String s) {
        
        String temp[] = s.split(" ", -1);
        String answer = "";
        for(int i = 0 ; i < temp.length ; i++){
            String word = temp[i];
            String a = "";
            for(int j = 0 ; j < word.length() ; j++){
                if(j % 2 == 0){
                  a += String.valueOf( Character.toUpperCase( word.charAt(j) ));
                }else{
                  a += String.valueOf( Character.toLowerCase( word.charAt(j) ));
                }
                
            }
            answer += a + " ";
        }
        
       
           answer = answer.substring(0, answer.length() -1); 

        return answer;
    }
}