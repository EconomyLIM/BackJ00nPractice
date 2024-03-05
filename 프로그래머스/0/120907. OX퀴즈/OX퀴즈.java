class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[ quiz.length ];
        
        for(int i = 0 ; i < quiz.length ; i++){
            String temp = quiz[i];
            
            String sik[] = temp.split(" = ");
            int c = Integer.parseInt(sik[1]);
            
            String front[] = sik[0].split(" ");
            int a = Integer.parseInt(front[0]);
            int b = Integer.parseInt(front[2]);
            
            int classAnswer = 0;
            if( front[1].equals("+")){
                classAnswer = a + b;
            } else{
                classAnswer = a - b;
            }
            
            if(classAnswer == c){
                answer[i] = "O";
            }else{
                answer[i] = "X";
            }
            
            
        } // for
        
        
        return answer;
    }
}