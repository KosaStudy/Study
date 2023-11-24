package CodingTest.SolvedAC_Lv3;

import java.util.Scanner;

class Z_양석진 {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int size = (int) Math.pow(2, N);

        dfs(size, r, c);

        System.out.println(count);
    }

    static void dfs(int size, int r, int c) {
        if (size == 1) return;
        if (r < size / 2 && c < size / 2) {
            // 1 사분면
            dfs(size / 2, r, c);
        } else if (r < size / 2 && c >= size / 2) {
            // 2 사분면
            count += size * size / 4;
            dfs(size / 2, r, c - size / 2);
        } else if (r >= size / 2 && c < size / 2) {
            count += (size * size / 4) * 2;
            dfs(size / 2, r - size / 2, c);
        } else {
            count += (size * size / 4) * 3;
            dfs(size / 2, r - size / 2, c - size / 2);
        }
    }
}