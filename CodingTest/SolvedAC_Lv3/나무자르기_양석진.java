package CodingTest.SolvedAC_Lv3;

import java.util.Scanner;

public class 나무자르기_양석진 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[] tree = new int[N];

        int min = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            tree[i] = in.nextInt();

            if (max < tree[i]) {
                max = tree[i];
            }
        }
        while (min < max) {

            int mid = (min + max) / 2;
            long sum = 0;
            for (int height : tree) {

                if (height - mid > 0) {
                    sum += (height - mid);
                }
            }
            if (sum < M) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }
}