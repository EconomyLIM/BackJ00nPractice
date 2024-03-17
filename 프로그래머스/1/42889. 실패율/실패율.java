import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] doneStage = new int[N + 1];
        int sum = stages.length;
        
        for (int stage : stages) {
            if (stage <= N) doneStage[stage]++;
        }
        
        Node[] temp = new Node[N];
        for (int i = 1; i <= N; i++) {
            double avg = sum == 0 ? 0 : (double) doneStage[i] / sum;
            temp[i - 1] = new Node(i, avg);
            sum -= doneStage[i];
        }
        
        Arrays.sort(temp, (o1, o2) -> Double.compare(o2.avg, o1.avg));
        
        for (int i = 0; i < N; i++) {
            answer[i] = temp[i].index;
        }
        
        return answer;
    }

    public static class Node {
        int index;
        double avg;
        
        public Node(int index, double avg) {
            this.index = index;
            this.avg = avg;
        }
    }
}
/*
스테이지에 도달 했으나 아직 클리어하지 못한 플레이어 수 / 스테이지에 도달한 플레이어 수

*/