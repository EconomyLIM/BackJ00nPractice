import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    int w, h, x, y, p, player = 0;

    public static void main(String[] args) throws IOException {
        Main game = new Main(); // 클래스의 인스턴스 생성
        game.run();
    }

    public void run() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken());

        for (int i = 0; i < p; i++) {
            st = new StringTokenizer(br.readLine());
            int px = Integer.parseInt(st.nextToken());
            int py = Integer.parseInt(st.nextToken());

            if (squareCal(px, py) || semicicleCal(px, py)) {
                player++;
            }
        }

        System.out.println(player);
    }

    // 각 위치별 거리 구하는 함수
    public double pointDistance(int x1, int y1, int x2, int y2) {
        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return distance;
    }

    public boolean squareCal(int px, int py) {
        if (px >= this.x && py >= this.y && px <= this.x + this.w && py <= this.y + this.h) {
            return true;
        }
        return false;
    }

    // 선수가 반원 안에 존재하는지 확인하는 함수
    public boolean semicicleCal(int px, int py) {
        int radius = this.h / 2; // 지름 = 높이, 반지름 = 높이 / 2
        if (px < this.x) { // 왼쪽 반원
            int centerX = this.x;
            int centerY = this.y + radius;
            double distance = pointDistance(px, py, centerX, centerY);
            if (distance <= radius) { // 반지름보다 작거나 같으면 안에 존재
                return true;
            }
        } else if (px > this.x + this.w) { // 오른쪽 반원
            int centerX = this.x + this.w;
            int centerY = this.y + radius;
            double distance = pointDistance(px, py, centerX, centerY);
            if (distance <= radius) { // 반지름보다 작거나 같으면 안에 존재
                return true;
            }
        }
        return false;
    }
}
