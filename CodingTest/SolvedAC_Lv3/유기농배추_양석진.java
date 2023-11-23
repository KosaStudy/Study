import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class 유기농배추 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();
        // 사방 탐색을 위한 배열
        int[] d_x = new int[]{-1, 0, 1, 0};
        int[] d_y = new int[]{0, -1, 0, 1};

        for (int x = 0; x < T; x++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] map = new int[N][M];
            boolean[][] visited = new boolean[N][M];
            int K = sc.nextInt();

            Queue<Pair> qu = new LinkedList<>();

            // K개의 배추 심기
            for (int y = 0; y < K; y++) {
                int k_x = sc.nextInt();
                int k_y = sc.nextInt();
                map[k_x][k_y] = 1;
            }

            int count = 0;

            // 밭 탐색하기
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    // 탐색할 떄, 배추가 없거나 이미 방문한 곳이면 넘어가기
                    if (map[i][j] == 0 || visited[i][j]) continue;
                    // 아니면 큐에 넣기
                    qu.add(new Pair(i, j));

                    // 큐가 비어있을 때 까지 반복
                    // 하나의 배추를 찾아서 사방탐색으로 근처에 있는 배추 찾기
                    while (!qu.isEmpty()) {
                        Pair p = qu.poll();
                        // 먼저 뽑은 것을 방문 처리하기
                        visited[p.x][p.y] = true;
                        // 사방 탐색 진행
                        for (int d = 0; d < 4; d++) {
                            int dx = p.x + d_x[d];
                            int dy = p.y + d_y[d];

                            // 밭의 크기에서 벗어나면 통과하기
                            if (dx >= 0 && dy >= 0 && dx < N && dy < M) {
                                // 배추이고 방문하지 않은 배추면 다시 Queue에 넣기
                                if (!visited[dx][dy] && map[dx][dy] == 1) {
                                    qu.add(new Pair(dx, dy));
                                    visited[dx][dy] = true;
                                }
                            }
                        }
                    }
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}