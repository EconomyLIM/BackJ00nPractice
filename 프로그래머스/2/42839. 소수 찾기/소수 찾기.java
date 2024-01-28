import java.util.*;

class Solution {
    
    private static HashSet<Integer> set = new HashSet<>();   
    private static boolean [] visited;
    
    public int solution(String numbers) {
        int answer = 0;
        
        visited = new boolean [numbers.length() ];
        
        makeNumbers(numbers, "", 0);
        
        for(int i : set){
            if(isPrime(i))
                answer++;
        }
        
        
        return answer;
    }
    
    public static void makeNumbers(String numbers, String number, int depth){
        
        if(depth > numbers.length() )
            return;
        
        
        for(int i = 0 ; i < numbers.length() ; i++){
            
            if(!visited[i]){
                visited[i] = true;
                System.out.println(number + numbers.charAt(i));
                set.add(Integer.parseInt(number + numbers.charAt(i) ));
                makeNumbers(numbers, number + numbers.charAt(i), depth + 1);
                visited[i] = false;
                
            } // if
            
        } // for
        
        
        
    } //makeNumbers
    
    public static boolean isPrime(int num){
        if(num < 2)
            return false;
        
        for(int i = 2 ; i <= (int) Math.sqrt(num) ; i++){
            if(num % i == 0)
                return false;
        }
        
        return true;
    } // isPrime
    
} // class