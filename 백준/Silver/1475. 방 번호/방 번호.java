import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] N = br.readLine().split("");

        int [] temp = new int[10];
        for (int i = 0; i < N.length; i++) {
            int a = Integer.parseInt(N[i]);
            if (a == 6 ){
                temp[9]++;
            }else{
                temp[a]++;
            }
        }

        
        temp[9] = (int) Math.ceil((double)temp[9]/2);

        int max = 0;
        for (int i = 0; i < temp.length ; i++) {
            if (temp[i] > max){
                max = temp[i];
            }
        }
        System.out.println(max);
    }
}