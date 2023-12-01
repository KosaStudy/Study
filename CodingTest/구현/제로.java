package CodingTest.구현;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 제로 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        for (int x = 0; x < K; x++) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) st.pop();
            else st.push(input);
        }

        int sum = 0;
        while (st.size() != 0) {
            sum += st.pop();
        }

        System.out.println(sum);

    }
}
