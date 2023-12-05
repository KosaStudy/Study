package CodingTest.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 요세푸스문제_양석진 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> qu = new LinkedList<>();
        for (int x = 1; x <= N; x++) {
            qu.add(x);
        }

        int count = 1;
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (qu.size() > 1) {
            if (count == K) {
                count = 1;
                int input = qu.poll();
                sb.append(input + ", ");
            } else {
                qu.add(qu.poll());
                count++;
            }
        }
        sb.append(qu.poll() + ">");

        System.out.println(sb);
    }
}
