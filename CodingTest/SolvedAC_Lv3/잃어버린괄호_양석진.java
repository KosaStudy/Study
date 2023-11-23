package CodingTest.SolvedAC_Lv3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 잃어버린괄호_양석진 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int sum = Integer.MAX_VALUE;
        StringTokenizer subtraction = new StringTokenizer(in.nextLine(), "-");

        while (subtraction.hasMoreTokens()) {
            int temp = 0;

            StringTokenizer addition = new StringTokenizer(subtraction.nextToken(), "+");

            while (addition.hasMoreTokens()) {
                temp += Integer.parseInt(addition.nextToken());
            }

            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }
        System.out.println(sum);
    }

}