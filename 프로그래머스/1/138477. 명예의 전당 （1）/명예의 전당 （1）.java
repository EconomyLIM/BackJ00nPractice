import java.util.*;

class Solution {
    public List<Integer> solution(int k, int[] score) {
        List<Integer> answer = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 최소 힙

        for (int s : score) {
            pq.offer(s);
            if (pq.size() > k) {
                pq.poll(); // 최하위 점수 제거
            }
            answer.add(pq.peek()); // 명예의 전당 최하위 점수
        }
        return answer;
    }
}
