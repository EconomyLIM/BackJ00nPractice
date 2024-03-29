import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Arrays.sort(strings);
        Node nodes[] = new Node[strings.length];
        Node node;
        for(int i = 0 ; i < strings.length ; i++){
            String temp = strings[i];
            node = new Node(temp, String.valueOf(temp.charAt(n)));
            nodes[i] = node;
        }
        
        Arrays.sort(nodes, (o1,o2) -> o1.word.compareTo(o2.word));
        
        for(int i = 0 ; i < strings.length ; i++){
            answer[i] = nodes[i].name;
        }
        
        return answer;
    }
    public static class Node{
        String name;
        String word;
        
        public Node(String name, String word){
            this.name = name;
            this.word = word;
        }
    }
}