import java.util.*;

class Solution {
    static Stack<Integer> cards1IdxList = new Stack<>();
    static Stack<Integer> cards2IdxList = new Stack<>();
    
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        String temp;

        for(int i = 0 ; i < goal.length ; i ++){
            temp = goal[i];
            
            for(int j = 0 ; j < cards1.length ; j++){
                if(temp.equals(cards1[j])){
                   // System.out.println("card1: " + cards1[j] + j);
                    if( checkIdx(cards1IdxList, j) ){
                        return "No";
                    } else{
                        continue;
                    }
                } // if
            }
            
            for(int z = 0 ; z < cards2.length ; z++){
                if(temp.equals(cards2[z])){
                    if( checkIdx(cards2IdxList, z) ){
                        return "No";
                    } else{
                        continue;
                    }
                } // if
            } // for
            
        } // for

        return "Yes";
    } // solution
    
    public static boolean checkIdx(Stack<Integer> stack, int idx){
        
        if(!stack.isEmpty() && stack.peek()+1 != idx){
            return true;
        } // if
        stack.push(idx);
        
        return false;
    }//checkIdx
} // class