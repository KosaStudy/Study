package CodingTest.SolvedAC_Lv3;

public class 셀프넘버_양석진 {

    public static void main(String[] args) {

        boolean[] check = new boolean[10001];

        // 0인 경우는 제외한다.
        for (int x = 1; x < 10001; x++) {
            int n = d(x);

            if (n < 10001) {
                check[n] = true;
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int x = 1; x < 10001; x++) {
            if (!check[x]) {
                sb.append(x).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int d(int number) {
        int sum = number;

        // 셀프 넘버인 1, 3, 5를 집어넣었다고 생각해보자.
        // 그러면 return 되는 값은 셀프 넘버를 생성자로 사용하는 숫자들이 출력되고 위에 로직에 의해 체크된다
        while (number != 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }
        return sum;
    }
}
