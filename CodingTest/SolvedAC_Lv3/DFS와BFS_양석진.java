package CodingTest.SolvedAC_Lv3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class DFS와BFS_양석진 {

    static int N;
    static int M;
    static int start;
    static int[][] arr;
    static boolean[] check;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        start = sc.nextInt();

        arr = new int[N + 1][N + 1];
        check = new boolean[N + 1];

        // 간선 만들기
        for (int x = 0; x < M; x++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        dfs(start);
        System.out.println();
        Queue<Integer> qu = new LinkedList<>();
        check = new boolean[N + 1];
        bfs(start, qu);
    }

    static void dfs(int num) {
        check[num] = true;
        System.out.printf(num + " ");

        for (int x = 1; x <= N; x++) {
            if (arr[num][x] == 1 && !check[x]) {
                dfs(x);
            }
        }
    }

    static void bfs(int num, Queue<Integer> q) {
        q.add(num);
        // 처음 방문 때문에 true 처리를 해준 것
        check[num] = true;

        while (!q.isEmpty()) {
            int result = q.poll();
            System.out.printf(result + " ");

            for (int x = 1; x <= N; x++) {
                if (arr[result][x] == 1 && !check[x]) {
                    // 여기에서 방문 처리를 안했더니 dfs와 같아짐
                    check[x] = true;
                    q.add(x);
                }
            }
        }
    }
}