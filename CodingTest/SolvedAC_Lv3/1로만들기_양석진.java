package CodingTest.SolvedAC_Lv3;

import java.util.Scanner;

/* 1로 만들기 */
 class _1_로만들기 {
    static Integer[] dp;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        dp = new Integer[n + 1];
        dp[0] = dp[1] = 0;

        System.out.println(recur(n));
    }

    static int recur(int n) {
        if(dp[n] == null) {
            if(n % 6 == 0) {
                dp[n] = Math.min(recur(n-1), Math.min(recur(n / 3), recur(n / 2))) + 1;
            }else if(n % 3 == 0) {
                dp[n] = Math.min(recur(n-1), recur(n / 3)) + 1;
            }else if(n % 2 == 0) {
                dp[n] = Math.min(recur(n-1), recur(n / 2)) + 1;
            }else {
                dp[n] = recur(n - 1) + 1;
            }
        }
        return dp[n];
    }
}