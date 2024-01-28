import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        List<Person> list = List.of(
            new Person(new LinkedList<>( List.of(1,2,3,4,5) ), 0)
            , new Person(new LinkedList<>( List.of(2,1,2,3,2,4,2,5) ), 0)
            , new Person(new LinkedList<>( List.of(3, 3, 1, 1, 2, 2, 4, 4, 5, 5) ), 0)
        );
        
        for(int i = 0 ; i < answers.length ; i++){
            
            for(Person persons : list){
                int num = persons.queue.poll();
                if( num == answers[i]) persons.score++;
                persons.queue.offer(num);
                
            } // for
            
        } // for
        
        int maxScore = 0;
        for(Person persons : list){
            if(maxScore < persons.score)
                maxScore = persons.score;
        }
        
        List<Integer> maxList = new ArrayList<>();
        for(int i = 0 ; i < list.size() ; i++){
            int score = list.get(i).score;
            if(maxScore == score)
                maxList.add(i+1);
        }
        
        return maxList.stream().mapToInt(Integer::intValue).toArray();
    } // solution
    
    public class Person{
        public Queue<Integer> queue;
        public int score;
        
        public Person(Queue<Integer> queue, int score){
            this.queue = queue;
            this.score = score;
        }
        
    } // person
} // class