package CodingTest.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 크로아티아알파벳_양석진 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int len = input.length();
        int count = 0;

        for (int x = 0; x < len; x++) {
            char ch = input.charAt(x);

            // len - 1을 해주는 이유는 반례 = 마지막 문자가 if 조건에 걸릴 때, 다음 문자가 없기 때문에 outOfIndex 에러가 걸리기 때문이다.
            if (ch == 'c' && x < len - 1) {
                if (input.charAt(x + 1) == '=' || input.charAt(x + 1) == '-') {
                    x++;
                }
            } else if (ch == 'd' && x < len - 1) {
                if (input.charAt(x + 1) == '-') {
                    x++;
                } else if (input.charAt(x + 1) == 'z' && x < len - 2) {
                    if (input.charAt(x + 2) == '=') {
                        x += 2;
                    }
                }
            } else if ((ch == 'l' || ch == 'n') && x < len - 1) {
                if (input.charAt(x + 1) == 'j') {
                    x++;
                }
            } else if ((ch == 's' || ch == 'z') && x < len - 1) {
                if (input.charAt(x + 1) == '=') {
                    x++;
                }
            }
            count++;
        }
        System.out.println(count);
    }

}