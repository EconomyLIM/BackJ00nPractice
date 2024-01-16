import java.util.*;

public class Solution {
    public Stack solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        
        for(int i : arr){
            
            if(stack.peek() != i){
                stack.push(i);    
            } // if
            
        } // for

        return stack;
    }
}