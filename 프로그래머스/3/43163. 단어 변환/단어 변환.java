class Solution {
    
    private static int answer = 0;

    private static boolean [] visited;
    
    public int solution(String begin, String target, String[] words) {
        
        visited = new boolean[words.length];
       
        dfs(begin, target, words,0);

        return answer;
    }
    public static void dfs(String begin, String target, String[] words, int depth){
        if(begin.equals(target)){
            answer = depth;
            return;
        }
        for(int i = 0 ; i < words.length ; i++){
            if(visited[i])
                continue;
            
            if( comparisonWord(begin, words[i]) ){
                
                visited[i] = true;
                dfs( words[i], target, words, depth + 1);
                visited[i] = false;

            }
            
        } // for
        
       // return;
        
    } // dfs
    
    public static boolean comparisonWord(String a, String b){
      
        char [] c = a.toCharArray();
        char [] d = b.toCharArray();
        int cnt = 0;
        for(int i = 0 ; i < c.length ; i++){
            if(c[i] == d[i])
                cnt++;
        }
        if(cnt >= c.length -1){
            return true;
        }
        return false;
            
    } // comparisonWord
    
}