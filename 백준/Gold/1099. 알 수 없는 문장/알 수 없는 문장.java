import java.io.*;
import java.util.*;

public class Main {
    static String sentence;
    static int N;
    static String[] words;
    static int[] dp;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        sentence = br.readLine();
        int sentenceLength = sentence.length();
        
        N = Integer.parseInt(br.readLine());
        words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }
        
        // dp 배열을 큰 값으로 초기화
        dp = new int[sentenceLength + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;  // 시작점 초기화
        
        // dp 계산
        for (int i = 0; i < sentenceLength; i++) {
            if (dp[i] == Integer.MAX_VALUE) continue;  // i번째에서 해석할 수 없는 경우 스킵
            
            for (String word : words) {
                int wordLen = word.length();
                if (i + wordLen <= sentenceLength) {
                    String sub = sentence.substring(i, i + wordLen);
                    int cost = calculateCost(sub, word);
                    if (cost != -1) {
                        dp[i + wordLen] = Math.min(dp[i + wordLen], dp[i] + cost);
                    }
                }
            }
        }
        
        // 결과 출력
        if (dp[sentenceLength] == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(dp[sentenceLength]);
        }
    }
    
    // 단어를 재배열하는 데 필요한 최소 비용을 계산하는 함수
    static int calculateCost(String a, String b) {
        if (a.length() != b.length()) return -1;
        
        int[] countA = new int[26];
        int[] countB = new int[26];
        
        // 각 단어의 알파벳 빈도 수 계산
        for (char c : a.toCharArray()) {
            countA[c - 'a']++;
        }
        for (char c : b.toCharArray()) {
            countB[c - 'a']++;
        }
        
        // 단어의 알파벳 구성 비교 (같은 알파벳으로만 변형 가능해야 함)
        for (int i = 0; i < 26; i++) {
            if (countA[i] != countB[i]) {
                return -1;
            }
        }
        
        // 최소 비용 계산
        int cost = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                cost++;
            }
        }
        return cost;
    }
}