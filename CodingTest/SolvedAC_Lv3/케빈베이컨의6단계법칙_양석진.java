package CodingTest.SolvedAC_Lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class 케빈베이컨의6단계법칙 {
    static int[][] relations;
    static boolean[] visited;
    static int result;
    static int min_count = Integer.MAX_VALUE;

    static int N, M;

    static class User {
        int num;
        int value;

        public User(int num, int value) {
            this.num = num;
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        relations = new int[N + 1][N + 1];

        for (int x = 0; x < M; x++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            relations[a][b] = relations[b][a] = 1;
        }

        for (int x = 1; x <= N; x++) {
            visited = new boolean[N + 1];
            bfs(x);
        }
        System.out.println(result);
    }

    static void bfs(int index) {
        Queue<User> qu = new LinkedList<>();
        int count = 0;

        visited[index] = true;
        qu.offer(new User(index, 0));
        while (!qu.isEmpty()) {
            User user = qu.poll();
            count += user.value;

            for (int i = 1; i <= N; i++) {
                int num = relations[user.num][i];

                if (num == 1 && visited[i] == false) {
                    visited[i] = true;
                    qu.offer(new User(i, user.value + 1));
                }
            }
        }
        if (min_count > count) {
            min_count = count;
            result = index;
        }
    }
}