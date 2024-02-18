import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int index = 0;
        int length = order.length; 
        Stack<Integer> stack = new Stack<>();
       
        for(int i = 1 ; i <= length ; i++){
            
            // 만약 현재 번호가 오더순서가 안맞을때
            if (order[index] != i) {
                stack.push(i);
            } else{ // 만약 현재 번호가 오더순서가 맞을때
                index++;
                answer++;
            }
            
            // 만약 보조 컨테이너 벨트에 물품이 있을 시
            // 보조 컨테이너 벨트의 맨 앞 물품이 같을때
             while(!stack.isEmpty() && stack.peek() == order[index] ){
                stack.pop();
                index++;
                answer++;
            }
 
        } // for

        return answer++;
    }
}