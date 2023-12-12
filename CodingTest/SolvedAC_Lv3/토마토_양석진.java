package CodingTest.SolvedAC_Lv3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 토마토_양석진 {
    static int[][] board = new int[1002][1002];
    static int[][] dist = new int[1002][1002];
    static int n, m;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        Queue<Pair> Q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();
                if (board[i][j] == 1)
                    Q.add(new Pair(i, j));
                if (board[i][j] == 0)
                    dist[i][j] = -1;
            }
        }

        while (!Q.isEmpty()) {
            Pair pair = Q.poll();
            for (int x = 0; x < 4; x++) {
                int d_x = pair.x + dx[x];
                int d_y = pair.y + dy[x];

                if (d_x < 0 || d_y < 0 || d_x >= n || d_y >= m) continue;
                if (dist[d_x][d_y] >= 0) continue;
                dist[d_x][d_y] = dist[pair.x][pair.y] + 1;
                Q.add(new Pair(d_x, d_y));
            }
        }

        int ans = 0;
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                if (dist[x][y] == -1) {
                    System.out.println(-1);
                    return;
                }
                ans = Math.max(ans, dist[x][y]);
            }
        }
        System.out.println(ans);
    }

    static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
