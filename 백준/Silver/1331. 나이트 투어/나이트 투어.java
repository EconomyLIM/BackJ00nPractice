import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int n = 36;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean [][]visited = new boolean[6][6];

        String temp;
        String a[];
        int x = 0, y = 0;
        int beforeX = 0 , beforeY = 0;
        int startX = 0 , startY = 0;
        boolean flag = true;
        for (int i = 0; i < 36; i++) {
            temp = br.readLine();
            a = temp.split("");

            switch (a[0]){
                case "A": x = 0;
                break;
                case "B": x = 1;
                break;
                case "C": x = 2;
                    break;
                case "D": x = 3;
                    break;
                case "E": x = 4;
                    break;
                case "F": x = 5;
                    break;
                default: x = 0;
                break;
            }
            y = Integer.parseInt(a[1])-1;

            if(visited[x][y]) {flag = false;} // 방문한 좌표 체크

            if(i == 0) { // 시작점과 현재 좌표를 저장
                beforeX = x;
                beforeY = y;
                startX = x;
                startY = y;
            }else{
                int diffX = Math.abs(beforeX - x);
                int diffY = Math.abs(beforeY - y);

                if( Math.pow(diffX, 2) + Math.pow(diffY, 2) != 5){
                    flag = false;
                }

                beforeX = x; // 현재 좌표 저장
                beforeY = y;

            }
            visited[x][y] = true;
        } // for

        for (int i = 0; i < visited.length; i++) { // 방문안한 노드가 있는지 체크
            for (int j = 0; j < visited[0].length; j++) {
                if(!visited[i][j] || !flag){
                    System.out.println("Invalid");
                    return;
                }
            }
        }
        if ( Math.pow(Math.abs(startX - x) , 2) + Math.pow(Math.abs(startY - y), 2)  != 5){
            System.out.println("Invalid");
        }else{
            System.out.println("Valid");
        }

    } //  main
}