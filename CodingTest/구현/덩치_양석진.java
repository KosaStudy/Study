package CodingTest.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 덩치_양석진 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        for (int x = 0; x < arr.length; x++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[x][0] = Integer.parseInt(st.nextToken());
            arr[x][1] = Integer.parseInt(st.nextToken());
        }

        for (int x = 0; x < N; x++) {
            int rank = 1;
            for (int y = 0; y < N; y++) {
                if (x == y) continue;
                if (arr[x][0] < arr[y][0] && arr[x][1] < arr[y][1]) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}


