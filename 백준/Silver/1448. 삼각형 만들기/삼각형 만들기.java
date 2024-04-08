import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int i = arr.length -1 ; i >=2 ; i--) {
           int c = arr[i];
           int b = arr[i-1];
           int a = arr[i-2];

            if (a+b > c){
                System.out.println(a+b+c);
                return;
            }

        } // for
        System.out.println("-1");
    } // main
}