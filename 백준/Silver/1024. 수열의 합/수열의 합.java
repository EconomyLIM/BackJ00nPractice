import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long N = scn.nextLong();
        int L = scn.nextInt();
        boolean found = false;

        for (int k = L; k <= 100; k++) {
            long numerator = N - k * (k - 1) / 2;
            if (numerator < 0) {
                continue; // x가 음수가 될 수 없으므로 다음 k로 넘어갑니다.
            }
            if (numerator % k != 0) {
                continue; // x가 정수가 아니므로 다음 k로 넘어갑니다.
            }
            long x = numerator / k;
            if (x < 0) {
                continue; // x가 음수면 다음 k로 넘어갑니다.
            }
            for (int i = 0; i < k; i++) {
                System.out.print((x + i) + " ");
            }
            found = true;
            break;
        }
        if (!found) {
            System.out.println(-1);
        }
        scn.close();
    }
}
