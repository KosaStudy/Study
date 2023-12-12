package CodingTest.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 색종이_양석진 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[101][101];

        int total = 0;
        for (int x = 0; x < N; x++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int width = Integer.parseInt(st.nextToken());
            int length = Integer.parseInt(st.nextToken());

            for (int y = width; y <= width + 10; y++) {
                for (int z = length; z <= length + 10; z++) {
                    if (!arr[y][z]) {
                        arr[y][z] = true;
                        total++;
                    }
                }
            }
        }
        System.out.println(total);
    }
}