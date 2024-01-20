import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;

        Arrays.sort(book_time, (o1,o2) -> o1[0].compareTo(o2[0]) );
        
        int converTime[][] = new int[book_time.length][book_time[0].length];
        
        ArrayList< Stack<Integer> > list = new ArrayList<>();
        Stack<Integer> stack = null;
        Stack<Integer> newstack = null;
        int startTime;
        int endTime;
        
        for(int i = 0 ; i < book_time.length ; i++){
            
                startTime = convert(book_time[i][0]); // 시작 값
                endTime = convert(book_time[i][1]); // 종료 값
                
                if( list.isEmpty() ){
                    stack = new Stack<>();
                    stack.push(startTime);
                    stack.push(endTime);
                    list.add(stack);     
                    continue;
                }
                
                for(int z = 0 ; z < list.size() ; z ++){
                    stack = list.get(z);
                    int beforeEndTime = stack.peek();
                    if(beforeEndTime + 10 <= startTime){
                        
                        stack.push(startTime);
                        stack.push(endTime);
                        break;
                    }
                    
                    if(z == list.size() -1 ){
                        newstack = new Stack<>();
                        newstack.push(startTime);
                        newstack.push(endTime);
                        list.add(newstack);
                        break;
                    }
                    
                } // for  

            
        } // for
        
        return list.size();
    } // solution
    
    public static int convert(String time){
        String [] times = time.split(":");
        
        return Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
    } // convert
} // class