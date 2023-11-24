package CodingTest.SolvedAC_Lv3;

import java.util.*;

class 숨바꼭질 {
    static int[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Queue<Integer> qu = new LinkedList<>();

        visited = new int[100001];

        qu.offer(n);
        int level = 0;
        while (!qu.isEmpty()) {
            int len = qu.size();
            for (int i = 0; i < len; i++) {
                int result = qu.poll();
                int[] move = {result - 1, result + 1, result * 2};
                visited[result] = 1;

                if (result == m) {
                    System.out.println(level);
                    return;
                }

                for (int x = 0; x < move.length; x++) {
                    if (move[x] < 0  || move[x] > 100000) continue;
                    if (visited[move[x]] == 1) continue;
                    qu.offer(move[x]);
                }
            }
            level++;
        }
    }
}