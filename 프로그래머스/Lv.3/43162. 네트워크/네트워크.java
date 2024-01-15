class Solution {
    static int answer = 0;
    static boolean[] visited;
    public int solution(int n, int[][] computers) {
        
        visited = new boolean[computers.length];
        
        for(int i = 0 ; i < n ; i++){
            if(!visited[i]){
                answer++;
                dfs(computers, visited, i);
            } // if
        } // for
        
        return answer;
    } // solution
    
    public static void dfs(int [][] computers, boolean[] visited, int depth){
        visited[depth] = true;
        
        for(int j = 0 ; j <computers.length ; j++){
            
            if(computers[depth][j] == 1 && !visited[j]){
                dfs(computers, visited, j);
            } // if
        } // for
        
    } // dfs
        
} // class