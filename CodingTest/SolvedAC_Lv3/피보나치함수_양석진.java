package CodingTest.SolvedAC_Lv3;
import java.util.Scanner;

class Main {

    // Integer 타입을 왜썼을 까? Null을 사용할 수 있기 때문이다.
    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         N이 0과 1일 때는 값을 아니 미리 지정해준다. 
         추가적인 로직(N==1 && N==2)을 계산할 필요가 없다
        */
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        int T = sc.nextInt();

        for (int x = 1; x <= T; x++) {
            int N = sc.nextInt();
            fibonacci(N);
            System.out.println(dp[N][0] + " " + dp[N][1]);
        }
    }

    static Integer[] fibonacci(int n) {
        if (dp[n][0] == null || dp[n][1] == null) {
            /*
             피보나치 함수의 리턴 값이 Integer[] 배열이니 아래와 같이 사용할 수 있다.
             밑에 코드는 각 N일 때 하위의 fibo(N-1) + fibo(n-2) 의 0일때 더할 수 있다.
             최하위에는 이전에 설정한 1의 값이 있기 때문에 아래에서 위로 하나씩 더해서 올라온다.
            */
            dp[n][0] = fibonacci(n - 1)[0] + fibonacci(n - 2)[0];
            dp[n][1] = fibonacci(n - 1)[1] + fibonacci(n - 2)[1];
        }
        // N에 대한 0과 1, 즉 [N][0]과 [N][1] 을 담고 있는 [N]을 반환한다.
        return dp[n];
    }
}