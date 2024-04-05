import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static final int[] dx = {-1, 0, 1, 0};
    private static final int[] dy = {0, 1, 0, -1};
    private static int[][] map;
    private static boolean [][] visited;
    private static Queue<int []> queue = new LinkedList<>();;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < map.length; i++) {
            String temp[] = br.readLine().split(" ");
            for (int j = 0; j < temp.length; j++) {
                map[i][j] = Integer.parseInt(temp[j]);
            } // for
        } // for

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if(map[i][j] == 1 && !visited[i][j]){
                    int area = bfs(i, j);
                    list.add(area);
                } // if
            } // for
        } // for

        Collections.sort(list);
        System.out.println(list.size());
        if (list.isEmpty() ){
            System.out.println("0");
        }else{
            System.out.println(list.get(list.size()-1));
        }

    } // main

    public static int bfs(int x, int y){
        
        queue.add(new int[]{x, y});
        visited [x][y] = true;
        int sum = 1;
        while (!queue.isEmpty()){
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];

            for (int i = 0; i < 4; i++) {
                int mx = cx + dx[i];
                int my = cy + dy[i];

                if (mx < 0 || mx >= map.length || my < 0 || my >= map[0].length){
                    continue;
                }

                if(map[mx][my] == 1 && !visited[mx][my]){
                    queue.add(new int[]{mx, my});
                    visited[mx][my] = true;
                    sum++;
                } // if
            } // for

        } // while

        return sum;
    } // bfs
}