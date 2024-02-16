class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
	        
	        int start = 0;
	        int end = 0;
	        int n = sequence.length;
	        int length = Integer.MAX_VALUE;
	        long sum = 0;
	        
	        while (true) {
				if (sum >= k) {
					sum -= sequence[start++];
				}else if(end >= sequence.length) {
					break;
				}else {
					sum += sequence[end++];
				}
				
				if(sum == k) {
					if(length > end - start) {
						length = end - start;
						answer[0] = start;
						answer[1] = end-1;
					}
				}
				
			} // while
        
        
        return answer;
    }
}