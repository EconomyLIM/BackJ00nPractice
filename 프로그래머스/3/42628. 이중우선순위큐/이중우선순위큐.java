import java.util.*;

class Solution {
    PriorityQueue<Integer> queue = new PriorityQueue<>( (o1,o2) -> o1-o2 );
    PriorityQueue<Integer> temp = new PriorityQueue<>( (o1,o2) -> o2-o1 );
    
    public int[] solution(String[] operations) {
        int[] answer ;
        
        // 앞 문자열이 I, D인지
        
        // I이면 삽입
        
        // D이면 삭제
        // 비어있으면 continue;
        
        // init
        String code;
        int number;
        LinkedList<Integer> list = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        
        String line [] ;
        for(int i = 0 ; i < operations.length ; i++){
            line = operations[i].split(" ");
            code = line[0];
            number = Integer.parseInt(line[1]);
            
            if(code.equals("I")){
                queue.add(number);
                temp.add(number);
            }else{
                if(queue.isEmpty()) continue;
                
                if(number == -1){
                    int z = queue.poll();
                    temp.remove(z);
                }else if(number == 1){
                    int a = temp.poll();
                    queue.remove(a);
                } // else if
                
            } //else
            
        } // for
        
        if(queue.isEmpty()){
            answer = new int[]{0, 0};
        }else{
            answer = new int[]{temp.peek(), queue.peek()};
        }
        
        
        return answer;
    }
}