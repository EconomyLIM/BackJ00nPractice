import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
       
        // 오름차순 정렬
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        
        int count = 0;
        int idx = 0;
        int end = 0;
        
        while(count < jobs.length){
            
            while(idx < jobs.length && jobs[idx][0] <= end){
                queue.add(jobs[idx++]);
            }
            
            if(queue.isEmpty()){
                end = jobs[idx][0];
            } else{
                int[] cur = queue.poll();
                answer += cur[1] + end - cur[0];
                end += cur[1];
                count++;
            }
     
        }

        return answer/ jobs.length;
    }
}