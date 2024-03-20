class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String words [] = {"aya", "ye", "woo", "ma"};
        //String continueWords[] = {};
        
        for(int i = 0 ; i < babbling.length ; i++){
            
            if(babbling[i].contains("ayaaya")
              || babbling[i].contains("yeye")
              || babbling[i].contains("woowoo")
              || babbling[i].contains("mama")){
                continue;
            }
                
            for(int j = 0 ; j < words.length ; j++){
                babbling[i] = babbling[i].replace(words[j], " ");
            }
            babbling[i] = babbling[i].replace(" ", "");
        }
        
        for(String s : babbling){
            if(s.equals(""))
                answer++;
        }
        
        return answer;
    }
}