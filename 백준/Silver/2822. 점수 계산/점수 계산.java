import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Node [] nodes = new Node [8];
        int score;

        Node node;
        for (int i = 0; i < nodes.length; i++) {
            score = Integer.parseInt(br.readLine());
            node = new Node(i+1, score);
            nodes[i] = node;
        } // for

        Arrays.sort(nodes, (o1, o2) -> o2.score - o1.score);
        Node [] nodes2 = Arrays.copyOfRange(nodes,0,5);
        Arrays.sort(nodes2, (o1, o2) -> o1.index - o2.index);

        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += nodes2[i].score;
            sb.append(nodes2[i].index).append(" ");
        }
        sb.substring(0, sb.length()-1);

        System.out.println(sum);
        System.out.println(sb.toString());

    } // main

    public static class Node{
        private int index;
        private int score;

        public Node(int index, int score) {
            this.index = index;
            this.score = score;
        }
    }
}