import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int length = 0;
    static int count = 0;
    static  int[] alphabet = new int[27];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        length = s.length();

        boolean []visited = new boolean[length];
        for (int i = 0; i < length; i++) {
            alphabet[s.charAt(i) - 'a']++;
        }

        dfs(0, ' ');

        System.out.println(count);
    } // main

    public static void dfs(int index, char word){
        if(index == length){
            count++;
            return;
        }
        for (int i = 0; i < 27; i++) {
            if(alphabet[i] == 0) continue;

            if(word != (char)(i + 'a') ){
                alphabet[i]--;
                dfs(index + 1, (char)(i + 'a'));
                alphabet[i]++;
            }
        } // for
    } // dfs
}